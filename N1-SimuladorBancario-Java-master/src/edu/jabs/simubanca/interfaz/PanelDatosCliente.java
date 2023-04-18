package edu.jabs.simubanca.interfaz;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class PanelDatosCliente extends JPanel implements ActionListener
{

    
    private final static String AVANZAR_MES = "AVANZAR MES";
   
    private InterfazSimulador principal;

    
    private JLabel etiquetaNombre;

    
    private JLabel etiquetaCedula;

    
    private JLabel etiquetaMes;

    
    private JTextField txtNombre;

   
    private JTextField txtCedula;

   
    private JTextField txtMes;

   
    private JButton botonAvanzarMes;

    
    /**
    
     * @param ven 
     */
    public PanelDatosCliente( InterfazSimulador ven )
    {

        
        principal = ven;

       
        etiquetaNombre = new JLabel( "Nombre: " );
        etiquetaCedula = new JLabel( "Cédula: " );
        etiquetaMes = new JLabel( "Mes: " );
        txtNombre = new JTextField( 11 );
        txtCedula = new JTextField( 7 );
        txtMes = new JTextField( 2 );
        botonAvanzarMes = new JButton( );
        botonAvanzarMes.setText( ">>" );
        botonAvanzarMes.setActionCommand( AVANZAR_MES );
        botonAvanzarMes.addActionListener( this );

        
        GridBagLayout gridbag = new GridBagLayout( );
        setLayout( gridbag );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Datos Personales" ) ) );

        GridBagConstraints gbc;
        gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaNombre, gbc );

        gbc = new GridBagConstraints( 2, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaCedula, gbc );

        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtNombre, gbc );
        txtNombre.setEnabled( false );
        txtNombre.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 3, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtCedula, gbc );
        txtCedula.setEnabled( false );
        txtCedula.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 4, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaMes, gbc );

        gbc = new GridBagConstraints( 5, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtMes, gbc );
        txtMes.setEnabled( false );
        txtMes.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 6, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonAvanzarMes, gbc );
    }


    /**
     
     * @param event 
     */
    public void actionPerformed( ActionEvent event )
    {
        try
        {
            String command = event.getActionCommand( );
            if( command.equals( AVANZAR_MES ) )
            {
                principal.avanzarMesSimulacion( );
            }

        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, "Información inválida: intente de nuevo..." );
        }
        principal.actualizarCliente( );
    }

    /**
     * @param nombre 
     */
    public void actualizarNombre( String nombre )
    {
        txtNombre.setText( nombre );
    }

    /**
     
     * @param cedula 
     */
    public void actualizarCedula( String cedula )
    {
        txtCedula.setText( "" + cedula );
    }

    /**
     
     * @param mes 
     */
    public void actualizarMes( int mes )
    {
        txtMes.setText( "" + mes );
    }
}
