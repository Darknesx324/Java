package edu.jabs.simubanca.mundo;

/**
 * Esta clase representa la cuenta de ahorro que hace parte de la simulación bancaria de un cliente. La cuenta de ahorro paga interés compuesto (se pagan intereses sobre los
 * intereses ganados en meses anteriores)
 */
public class CuentaAhorros
{

    //-----------------------------------
    // Constantes
    //-----------------------------------

    //-----------------------------------
    // Atributos
    //-----------------------------------

    /**
     * Saldo actual de la cuenta de ahorro
     */
    private int saldo;

    /**
     * Interés mensual que paga la cuenta de ahorro: P. ej. 0.6% = 0,006
     */
    private double interesMensual;

    //-----------------------------------
    // Constructor
    //-----------------------------------

    public CuentaAhorros()
    {
    }

    //-----------------------------------
    // Métodos
    //-----------------------------------

    /**
     * Inicializa la cuenta de ahorro con el interés mensual que paga el banco
     */
    public void inicializar( )
    {
        //Saldo inicial de la cuenta de ahorro
        saldo = 0;
        interesMensual = darInteresMensual( );
    }

    /**
     * Retorna el saldo del cliente <br>
     * <b>pre: </b>La cuenta tiene un saldo válido <br>
     * <b>post: </b>Se retorna el saldo actual de la cuenta <br>
     *
     * @return saldo
     */
    public int darSaldo( )
    {
        return saldo;
    }

    /**
     * Consigna una cantidad de dinero en la cuenta del cliente <br>
     * <b>post: </b>El saldo se incrementa en valor <br>
     *
     * @param valor - el valor a consignar en la cuenta
     */
    public void consignarValor( int valor )
    {
        saldo = saldo + valor;
    }

    /**
     * Retira una cantidad de dinero de la cuenta de ahorro <br>
     * <b>post: </b>El saldo se reduce en valor <br>
     *
     * @param valor - el valor a retirar de la cuenta
     */
    public void retirarValor( int valor )
    {
        saldo = saldo - valor;
    }

    /**
     * Modifica el saldo, sumándole los intereses (ha pasado un mes). <br>
     * <b>post: </b>El saldo actual crece en el porcentaje de interés mensual <br>
     * respectivo
     */
    public void actualizarSaldoPorPasoMes( )
    {
        saldo = ( int ) ( saldo + ( saldo * interesMensual ) );
    }

    /**
     * Da el interés que paga el banco mensualmente por este tipo de cuentas <br>
     * <b>post: </b> Retorna el valor actual de la tasa de interés. <br>
     *
     * @return interés mensual de la cuenta de ahorros
     */
    public double darInteresMensual( )
    {
        return 0.006;
    }
}
