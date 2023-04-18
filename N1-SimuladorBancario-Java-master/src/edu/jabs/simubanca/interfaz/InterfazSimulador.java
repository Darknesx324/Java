package edu.jabs.simubanca.interfaz;

import edu.jabs.simubanca.mundo.CuentaBancaria;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;


public class InterfazSimulador extends JFrame
{

    private CuentaBancaria cuenta;

  
  
    private PanelOpciones panelOpciones;

    private PanelSaldos panelSaldos;
    private PanelDatosCliente panelDatos;

   

    /**
     
     * @param cli – 
     */
    public InterfazSimulador( CuentaBancaria cli )
    {
        setTitle( "BANCO EL GARITO DE ALVARO" );
        panelOpciones = new PanelOpciones( this );
        panelSaldos = new PanelSaldos( );
        panelDatos = new PanelDatosCliente( this );

        

        getContentPane( ).setLayout( new BorderLayout( ) );
        getContentPane( ).add( panelDatos, BorderLayout.NORTH );
        getContentPane( ).add( panelSaldos, BorderLayout.CENTER );
        getContentPane( ).add( panelOpciones, BorderLayout.SOUTH );

        setSize( 715, 400 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        cuenta = cli;
        actualizarCliente( );
    }

    
    public void actualizarCliente( )
    {
        String nombre = cuenta.darNombre( );
        String cedula = cuenta.darCedula( );
        panelDatos.actualizarNombre( nombre );
        panelDatos.actualizarCedula( "" + cedula );
        panelDatos.actualizarMes( cuenta.darMesActualSimulacion( ).darMes( ) );
        panelSaldos.actualizarSaldoTotal( formatearValor( cuenta.saldoTotal( ) ) );
        panelSaldos.actualizarSaldoCorriente( formatearValor( cuenta.darCuentaCorriente( ).darSaldo( ) ) );
        panelSaldos.actualizarSaldoAhorros( formatearValor( cuenta.darCuentaAhorro( ).darSaldo( ) ) + "   [" + ( cuenta.darCuentaAhorro( ).darInteresMensual( ) * 100 ) + "%]" );
        panelSaldos.actualizarSaldoCDT( formatearValor( cuenta.darCDT( ).valorPresente( cuenta.darMesActualSimulacion( ) ) ) + "   [" + ( cuenta.darCDT( ).darInteresMensual( ) * 100 ) + "%]" );

    }

    /**
     
     * @param strValor 
     * @param strInteres 
     */
    public void invertirCDT( String strValor, String strInteres )
    {
        if( strValor != null )
        {
            int monto = Integer.parseInt( strValor );
            double nInteres = Double.parseDouble( strInteres );
            cuenta.invertirCDT( monto, nInteres / 100 );
        }
    }

    
    public void cerrarCDT( )
    {
        cuenta.cerrarCDT( );
    }

    /**
    
     * @param strValor 
     */
    public void retirarAhorros( String strValor )
    {
        cuenta.retirarCuentaAhorro( Integer.parseInt( strValor ) );
    }

    /**
    
     * @param strValor 
     */
    public void consignarAhorros( String strValor )
    {
        cuenta.consignarCuentaAhorro( Integer.parseInt( strValor ) );
    }

    /**
     
     * @param strValor - el valor a retirar
     */
    public void retirarCorriente( String strValor )
    {
        cuenta.retirarCuentaCorriente( Integer.parseInt( strValor ) );
    }

    /**
     
     * @param strValor - el valor a consignar
     *
     */
    public void consignarCorriente( String strValor )
    {
        cuenta.consignarCuentaCorriente( Integer.parseInt( strValor ) );
    }

    /**
     
     * @param valor 
     * @return 
     */
    private String formatearValor( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }

  
    public void avanzarMesSimulacion( )
    {
        cuenta.avanzarMesSimulacion( );

    }

    
    public void reqFuncOpcion1( )
    {
        String respuesta = cuenta.metodo1( );
        JOptionPane.showMessageDialog( this, respuesta, "Respuesta Extencion1", JOptionPane.INFORMATION_MESSAGE );
    }

  
    public void reqFuncOpcion2( )
    {
        String respuesta = cuenta.metodo2( );
        JOptionPane.showMessageDialog( this, respuesta, "Respuesta Extencion1", JOptionPane.INFORMATION_MESSAGE );
    }

    
    /**
    
     * @param args 
     */
    public static void main( String[] args )
    {
        
        CuentaBancaria c = new CuentaBancaria( );
        c.inicializar( "11.43.983.081", "Harry Fabian Henao" );
        
        InterfazSimulador ventana = new InterfazSimulador( c );
        ventana.setVisible( true );
    }
}
