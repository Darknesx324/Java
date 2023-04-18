package edu.jabs.simubanca.interfaz;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class PanelSaldos extends JPanel
{

   

   
    private JLabel etiquetaSaldo;

   
    private JLabel etiquetaSaldoCorriente;

    
    private JLabel etiquetaSaldoAhorros;

    
    private JLabel etiquetaSaldoCdt;

    
    private JTextField txtSaldo;

    
    private JTextField txtSaldoCorriente;

   
    private JTextField txtSaldoAhorros;

   
    private JTextField txtSaldoCdt;

    
 
    public PanelSaldos( )
    {

        etiquetaSaldo = new JLabel( "Total: " );
        etiquetaSaldoCorriente = new JLabel( "Saldo Corriente: " );
        etiquetaSaldoAhorros = new JLabel( "Saldo Ahorros: " );
        etiquetaSaldoCdt = new JLabel( "Saldo CDT: " );

        
        txtSaldo = new JTextField( 12 );
        txtSaldoCorriente = new JTextField( 12 );
        txtSaldoAhorros = new JTextField( 12 );
        txtSaldoCdt = new JTextField( 12 );

        GridBagLayout gridbag = new GridBagLayout( );
        setLayout( gridbag );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Saldo" ) ) );
        GridBagConstraints gbc;

        gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaSaldoCorriente, gbc );
        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtSaldoCorriente, gbc );
        txtSaldoCorriente.setEnabled( false );
        txtSaldoCorriente.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaSaldoAhorros, gbc );
        gbc = new GridBagConstraints( 1, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtSaldoAhorros, gbc );
        txtSaldoAhorros.setEnabled( false );
        txtSaldoAhorros.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 0, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaSaldoCdt, gbc );
        gbc = new GridBagConstraints( 1, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtSaldoCdt, gbc );
        txtSaldoCdt.setEnabled( false );
        txtSaldoCdt.setDisabledTextColor( Color.BLUE );

        gbc = new GridBagConstraints( 2, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaSaldo, gbc );
        gbc = new GridBagConstraints( 3, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtSaldo, gbc );
        txtSaldo.setEnabled( false );
        txtSaldo.setDisabledTextColor( Color.BLUE );
    }

   

    /**
     
     * @param strValor 
     */
    public void actualizarSaldoTotal( String strValor )
    {
        txtSaldo.setText( strValor );
    }

    /**
     
     * @param strValor 
     */
    public void actualizarSaldoAhorros( String strValor )
    {
        txtSaldoAhorros.setText( strValor );
    }

    /**
     
     * @param strValor 
     */
    public void actualizarSaldoCorriente( String strValor )
    {
        txtSaldoCorriente.setText( strValor );
    }

    /**
     
     * @param strValor 
     */
    public void actualizarSaldoCDT( String strValor )
    {
        txtSaldoCdt.setText( strValor );
    }
}
