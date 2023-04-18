package edu.jabs.simubanca.mundo;

import edu.jabs.simubanca.util.Mes;

/**
 * Esta clase representa un cliente de un banco en una fecha dada. Sirve para hacer simulaciones en el tiempo de inversiones y gastos, manejando hasta 3 cuentas: una cuenta
 * corriente, una cuenta de ahorro y un CDT
 */
public class CuentaBancaria
{

    //-----------------------------------
    // Constantes
    //-----------------------------------

    //-----------------------------------
    // Atributos
    //-----------------------------------

    /**
     * Cédula del cliente
     */
    private String cedula;

    /**
     * Nombre del cliente
     */
    private String nombre;

    /**
     * Mes actual
     */
    private Mes mesActual;

    /**
     * Cuenta corriente del cliente
     */
    private CuentaCorriente corriente;

    /**
     * Cuenta de Ahorro del cliente
     */
    private CuentaAhorros ahorros;

    /**
     * CDT del cliente
     */
    private CDT inversion;

    //-----------------------------------
    // Constructor
    //-----------------------------------

    public CuentaBancaria()
    {
    }

    //-----------------------------------
    // Métodos
    //-----------------------------------

    /**
     * Inicializa una cuenta con la información básica, en el mes 0, y con sus tres cuentas vacías: CDT, corriente y de ahorros <br>
     *
     * @param cedulaP - cédula del nuevo cliente
     * @param nombreP - nombre del nuevo cliente
     */
    public void inicializar( String cedulaP, String nombreP )
    {
        // Inicializa los atributos personales del cliente
        nombre = nombreP;
        cedula = cedulaP;
        // Inicializa el mes en el 0
        mesActual = new Mes( );
        mesActual.inicializar( 1 );
        // Inicializa las tres cuentas en vacío
        corriente = new CuentaCorriente( );
        corriente.inicializar( );
        ahorros = new CuentaAhorros( );
        ahorros.inicializar( );
        inversion = new CDT( );
        inversion.inicalizar( );
    }

    /**
     * Retorna el nombre <br>
     * <b>post: </b> Retorna el nombre del cliente <br>
     *
     * @return nombre del cliente
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna la cédula <br>
     * <b>post: </b> retorna la cédula del cliente <br>
     *
     * @return cédula del cliente
     */
    public String darCedula( )
    {
        return cedula;
    }

    /**
     * El cliente invierte en su CDT <br>
     * <b>pre: </b> el cliente tiene asignado un CDT <br>
     * <b>post: </b> Invierte 'monto' a 'interesMensual'% en el CDT creado para el cliente en el momento de su construcción <br>
     *
     * @param monto - el valor a invertir en la cuenta
     * @param interesMensual - el interés del CDT elegido por el cliente
     */
    public void invertirCDT( int monto, double interesMensual )
    {
        inversion.invertir( monto, interesMensual, mesActual.darMes( ) );
    }

    /**
     * Consigna el valor en la cuenta corriente <br>
     * <b>pre: </b> El cliente tiene asignada una Cuenta Corriente <br>
     * <b>post: </b> Consigna en la cuenta corriente del cliente la cantidad 'valor' <br>
     *
     * @param valor - el valor a consignar en la cuenta
     */
    public void consignarCuentaCorriente( int valor )
    {
        corriente.consignarValor( valor );
    }

    /**
     * Consigna el valor en la cuenta de ahorros <br>
     * <b>pre: </b> El cliente tiene asignada una Cuenta de Ahorros <br>
     * <b>post: </b> Consigna en la cuenta de ahorros del cliente la cantidad 'valor' <br>
     *
     * @param valor - el valor a consignar en la cuenta
     */
    public void consignarCuentaAhorro( int valor )
    {
        ahorros.consignarValor( valor );
    }

    /**
     * Cierra el CDT, pasando el saldo a la cuenta corriente <br>
     * <b>pre: </b> el cliente tiene asignado un CDT y una cuenta corriente <br>
     * <b>post: </b> El CDT queda cerrado y con valores en 0, y la <br>
     * cuenta corriente aumenta su saldo en el valor del cierre del CDT
     */
    public void cerrarCDT( )
    {
        int valorCierreCDT = inversion.cerrar( mesActual );
        corriente.consignarValor( valorCierreCDT );
    }

    /**
     * Retira un valor de la cuenta corriente <br>
     * <b>pre: </b> El cliente tiene asignada una cuenta corriente <br>
     * <b>post: </b> El saldo de la cuenta se reduce en 'valor' <br>
     *
     * @param valor - el valor a retirar de la cuenta
     */
    public void retirarCuentaCorriente( int valor )
    {
        corriente.retirarValor( valor );
    }

    /**
     * Retira un valor de la cuenta de ahorros <br>
     * <b>pre: </b> El cliente tiene asignada una cuenta de Ahorros <br>
     * <b>post: </b> El saldo de la la cuenta se reduce en 'valor' <br>
     *
     * @param valor - - el valor a retirar de la cuenta
     */
    public void retirarCuentaAhorro( int valor )
    {
        ahorros.retirarValor( valor );
    }

    /**
     * Calcula el saldo total del cliente, sumando todas las cuentas. <br>
     * <b>post: </b> se retorna la suma de los saldos de cada una de las cuentas del cliente <br>
     *
     * @return saldo
     */
    public double saldoTotal( )
    {
        return corriente.darSaldo( ) + ahorros.darSaldo( ) + inversion.valorPresente( mesActual );
    }

    /**
     * Retorna la cuenta corriente
     *
     * @return Cuenta corriente del cliente
     */
    public CuentaCorriente darCuentaCorriente( )
    {
        return corriente;
    }

    /**
     * Retorna la cuenta de ahorro
     *
     * @return Cuenta de Ahorros del cliente
     */
    public CuentaAhorros darCuentaAhorro( )
    {
        return ahorros;
    }

    /**
     * Retorna el CDT
     *
     * @return CDT del cliente
     */
    public CDT darCDT( )
    {
        return inversion;
    }

    /**
     * Retorna el mes en el que se encuentra la simulación
     *
     * @return Mes actual
     */
    public Mes darMesActualSimulacion( )
    {
        return mesActual;
    }

    /**
     * Adelanta en un mes la simulación
     */
    public void avanzarMesSimulacion( )
    {
        // Avanza la fecha un mes
        mesActual.avanzarMes( );
        // Informa a la cuenta de ahorro el avance para que se calcule su valor
        // nuevamente,
        // incluyendo los intereses
        ahorros.actualizarSaldoPorPasoMes( );
    }

    /**
     * @return Retorna el resultado de la extensión 1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * @return Retorna el resultado de la extensión 2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}
