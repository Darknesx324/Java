package edu.jabs.simubanca.interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class PanelOpciones extends JPanel implements ActionListener
{

  
    private final static String ABRIR_CDT = "ABRIR CDT";

   
    private final static String CERRAR_CDT = "CERRAR CDT";

   
    private final static String CONSIGNAR_CUENTA_CORRIENTE = "CONSIGNAR CUENTA CORRIENTE";

    
    private final static String RETIRAR_CUENTA_CORRIENTE = "RETIRAR CUENTA CORRIENTE";

   
    private final static String RETIRAR_CUENTA_AHORRO = "RETIRAR CUENTA AHORRO";

    
    private final static String CONSIGNAR_CUENTA_AHORRO = "CONSIGNAR CUENTA AHORRO";

   
    private final static String OPCION_1 = "OPCION_1";

    
    private final static String OPCION_2 = "OPCION_2";

   

   
    private InterfazSimulador principal;

   

    
    private JButton botonAbrirCDT;

    
    private JButton botonCerrarCdt;

  
    private JButton botonConsignarCuentaCorriente;

   
    private JButton botonRetirarCuentaCorriente;

  
    private JButton botonConsignarCuentaAhorro;

  
    private JButton botonRetirarCuentaAhorro;

  
    private JButton opcion1;

     
    
    private JButton opcion2;

   
    /**
     
     * @param ven 
     */
    public PanelOpciones( InterfazSimulador ven )
    {

        
        principal = ven;
        botonAbrirCDT = new JButton( );
        botonCerrarCdt = new JButton( );
        botonConsignarCuentaCorriente = new JButton( );
        botonRetirarCuentaCorriente = new JButton( );
        botonConsignarCuentaAhorro = new JButton( );
        botonRetirarCuentaAhorro = new JButton( );
        opcion1 = new JButton( );
        opcion2 = new JButton( );

        
        GridBagLayout gridbag = new GridBagLayout( );
        setLayout( gridbag );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Cálculos" ) ) );

        GridBagConstraints gbc;
        gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonAbrirCDT, gbc );

        gbc = new GridBagConstraints( 0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonCerrarCdt, gbc );

        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonConsignarCuentaCorriente, gbc );

        gbc = new GridBagConstraints( 1, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonRetirarCuentaCorriente, gbc );

        gbc = new GridBagConstraints( 2, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonConsignarCuentaAhorro, gbc );

        gbc = new GridBagConstraints( 2, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonRetirarCuentaAhorro, gbc );

        gbc = new GridBagConstraints( 3, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( opcion1, gbc );

        gbc = new GridBagConstraints( 3, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( opcion2, gbc );

        
        inicializarBotones( );
    }

    
    /**
     
     */
    private void inicializarBotones( )
    {

        botonAbrirCDT.setText( "Abrir inversion CDT" );
        botonAbrirCDT.setActionCommand( ABRIR_CDT );
        botonAbrirCDT.addActionListener( this );

        botonCerrarCdt.setText( "Cerrar inversion CDT" );
        botonCerrarCdt.setActionCommand( CERRAR_CDT );
        botonCerrarCdt.addActionListener( this );

        botonConsignarCuentaCorriente.setText( "Consignar cuenta corriente" );
        botonConsignarCuentaCorriente.setActionCommand( CONSIGNAR_CUENTA_CORRIENTE );
        botonConsignarCuentaCorriente.addActionListener( this );

        botonRetirarCuentaCorriente.setText( "Retirar cuenta corriente" );
        botonRetirarCuentaCorriente.setActionCommand( RETIRAR_CUENTA_CORRIENTE );
        botonRetirarCuentaCorriente.addActionListener( this );

        botonConsignarCuentaAhorro.setText( "Consignar cuenta ahorro" );
        botonConsignarCuentaAhorro.setActionCommand( CONSIGNAR_CUENTA_AHORRO );
        botonConsignarCuentaAhorro.addActionListener( this );

        botonRetirarCuentaAhorro.setText( "Retirar cuenta ahorro" );
        botonRetirarCuentaAhorro.setActionCommand( RETIRAR_CUENTA_AHORRO );
        botonRetirarCuentaAhorro.addActionListener( this );

        opcion1.setText( "Opcion1" );
        opcion1.setActionCommand( OPCION_1 );
        opcion1.addActionListener( this );

        opcion2.setText( "Opcion2" );
        opcion2.setActionCommand( OPCION_2 );
        opcion2.addActionListener( this );
    }

    /**
     
     * @param event - Es el evento o accion realizada por el usuario
     */
    public void actionPerformed( ActionEvent event )
    {
        try
        {
            String command = event.getActionCommand( );
            if( command.equals( ABRIR_CDT ) )
            {
                String strValor = JOptionPane.showInputDialog( this, "Introduzca el valor de la inversion" );
                String strInteres = JOptionPane.showInputDialog( this, "Introduzca el interés mensual en porcentaje" );
                principal.invertirCDT( strValor, strInteres );

            }
            else if( command.equals( CERRAR_CDT ) )
            {
                principal.cerrarCDT( );

            }
            else if( command.equals( CONSIGNAR_CUENTA_CORRIENTE ) )
            {
                String strValor = JOptionPane.showInputDialog( this, "Introduzca el valor a consignar" );
                principal.consignarCorriente( strValor );
            }
            else if( command.equals( RETIRAR_CUENTA_CORRIENTE ) )
            {
                String strValor = JOptionPane.showInputDialog( this, "Introduzca el valor a retirar" );
                principal.retirarCorriente( strValor );
            }
            else if( command.equals( CONSIGNAR_CUENTA_AHORRO ) )
            {
                String strValor = JOptionPane.showInputDialog( this, "Introduzca el valor a consignar" );
                principal.consignarAhorros( strValor );
            }
            else if( command.equals( RETIRAR_CUENTA_AHORRO ) )
            {
                String strValor = JOptionPane.showInputDialog( this, "Introduzca el valor a retirar" );
                principal.retirarAhorros( strValor );
            }
            else if( command.equals( OPCION_1 ) )
            {
                principal.reqFuncOpcion1( );
            }
            else if( command.equals( OPCION_2 ) )
            {
                principal.reqFuncOpcion2( );
            }
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, "Información inválida: intente de nuevo..." );
        }
        principal.actualizarCliente( );

    }
}
