package edu.jabs.simubanca.mundo;

import edu.jabs.simubanca.util.Mes;

/**
 * Esta clase representa un CDT que el cliente tiene dentro de su cuenta bancaria. En un CDT el interés que se da no es compuesto, razón por lo cual no hay intereses sobre los
 * intereses
 */
public class CDT
{

    //-----------------------------------
    // Constantes
    //-----------------------------------

    //-----------------------------------
    // Atributos
    //-----------------------------------

    /**
     * Valor inicial del CDT
     */
    private int valorInvertido;

    /**
     * Interés mensual que da el CDT al cliente: P. ej. 5% = 0.05
     */
    private double interesMensual;

    /**
     * Fecha de inicio del CDT
     */
    private Mes mesApertura;

    //-----------------------------------
    // Constructor
    //-----------------------------------

    public CDT()
    {
    }

    //-----------------------------------
    // Métodos
    //-----------------------------------

    /**
     * Inicializa el CDT con valores iniciales en 0
     */
    public void inicalizar( )
    {
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = new Mes( );
        mesApertura.inicializar( 0 );
    }

    /**
     * Inicia una inversión en un CDT <b>post: </b>Se cambian los valores del cdt, con los valores recibidos <br>
     *
     * @param valorInvertidoP - Es el nuevo valor que se va a invertir en el CDT
     * @param interesMensualP - Es el interés mensual que va a ganar el CDT
     * @param numeroMes - Mes de apertura del CDT
     */
    public void invertir( int valorInvertidoP, double interesMensualP, int numeroMes )
    {
        valorInvertido = valorInvertidoP;
        interesMensual = interesMensualP;
        mesApertura = new Mes( );
        mesApertura.inicializar( numeroMes );
    }

    /**
     * Consulta el valor presente de la inversión teniendo en cuenta el interés de la Cuenta <br>
     * <b>pre: </b> Los valores del CDT son válidos <br>
     * <b>post: </b> se retorna un double con el valor presente de la inversión <br>
     *
     * @param mesActual - mes Actual, para calcular los intereses a partir del mes de apertura
     * @return valor presente del CDT
     */
    public int valorPresente( Mes mesActual )
    {
        int mesesTranscurridos = mesActual.calcularMesesDiferencia( mesApertura );
        return ( int ) ( valorInvertido + ( mesesTranscurridos * interesMensual * valorInvertido ) );
    }

    /**
     * Cierra el CDT y retorna el valor invertido más los intereses. <br>
     * <b>pre: </b>Los valores del CDT son validos <br>
     * <b>post: </b>Se retorna el rendimiento del CDT, y se colocan todos sus valores en 0 <br>
     *
     * @param mesActual - para calcular el rendimiento del CDT al momento del cierre
     * @return valor de cierre del CDT
     */
    public int cerrar( Mes mesActual )
    {
        int valorCierre = valorPresente( mesActual );
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = new Mes( );
        mesApertura.inicializar( 0 );
        return valorCierre;
    }

    /**
     * Da el interés que paga el banco mensualmente por este CDT <br>
     * <b>post: </b>Retorna el interés ingresado en el momento de la inversión en el CDT. <br>
     *
     * @return interés mensual del CDT
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }
}
