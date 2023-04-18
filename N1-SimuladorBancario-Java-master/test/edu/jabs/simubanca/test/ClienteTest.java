package edu.jabs.simubanca.test;

import junit.framework.TestCase;

import edu.jabs.simubanca.util.Mes;
import edu.jabs.simubanca.mundo.CuentaBancaria;

/**
 * Clase de pruebas para el cliente
 */
public class ClienteTest extends TestCase
{

    //-----------------------------------
    // Constantes
    //-----------------------------------

    //-----------------------------------
    // Atributos
    //-----------------------------------

    private CuentaBancaria cuenta;

    //-----------------------------------
    // Constructor
    //-----------------------------------

    public ClienteTest()
    {
    }

    //-----------------------------------
    // Métodos
    //-----------------------------------

    /**
     * Escenario con un CuentaBancaria vacio0
     */
    private void setupEscenario0( )
    {
        cuenta = new CuentaBancaria( );
        cuenta.inicializar( "50.152.468", "Sergio López" );
    }

    /**
     * Escenario con valores en todas las cuentas
     */
    private void setupEscenario1( )
    {
        setupEscenario0( );
        cuenta.invertirCDT( 1000000, 10 );
        cuenta.consignarCuentaAhorro( 500000 );
        cuenta.consignarCuentaCorriente( 600000 );
    }

    /**
     * Escenario con valores en todas las cuentas y retiros
     */
    private void setupEscenario2( )
    {
        setupEscenario0( );
        cuenta.invertirCDT( 1000000, 10 );
        cuenta.consignarCuentaAhorro( 500000 );
        cuenta.retirarCuentaAhorro( 200000 );
        cuenta.consignarCuentaCorriente( 600000 );
        cuenta.retirarCuentaCorriente( 100000 );
    }

    /**
     * Prueba el CDT en el escenario 1
     *
     */
    public void testInvertirCDT1( )
    {
        setupEscenario1( );
        Mes mes = new Mes( );
        mes.inicializar( 1 );
        assertEquals( 1000000, cuenta.darCDT( ).valorPresente( mes ) );

    }

    /**
     * Prueba la cuenta corriente en el escenario 1
     *
     */
    public void testConsignarCuentaCorriente1( )
    {
        setupEscenario1( );
        assertEquals( 600000, cuenta.darCuentaCorriente( ).darSaldo( ) );

    }

    /**
     * Prueba la cuenta de ahorros en el escenario 1
     *
     */
    public void testConsignarCuentaAhorro1( )
    {
        setupEscenario1( );
        assertEquals( 500000, cuenta.darCuentaAhorro( ).darSaldo( ) );
    }

    /**
     * Cierra el CDT en el escenario 1
     *
     */
    public void testCerrarCDT1( )
    {
        setupEscenario1( );
        Mes mes = new Mes( );
        mes.inicializar( 1 );
        int cerrado = cuenta.darCDT( ).cerrar( mes );
        cuenta.consignarCuentaCorriente( cerrado );
        double saldo = 1100000 + cerrado;
        assertEquals( ( int )saldo, ( int )cuenta.saldoTotal( ) );
    }

    /**
     * Prueba la cuenta corriente en el escenario 1
     *
     */
    public void testRetirarCuentaCorriente1( )
    {
        setupEscenario2( );
        assertEquals( 500000, cuenta.darCuentaCorriente( ).darSaldo( ) );
    }

    /**
     * Prueba la cuenta de ahorros en el escenario 1
     *
     */
    public void testRetirarCuentaAhorro1( )
    {
        setupEscenario2( );
        assertEquals( 300000, cuenta.darCuentaAhorro( ).darSaldo( ) );
    }

    /**
     * Prueba lel saldo total en el escenario 1
     *
     */
    public void testSaldoTotal1( )
    {
        setupEscenario2( );
        assertEquals( 1800000, ( int )cuenta.saldoTotal( ) );
    }
}
