import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadora extends JFrame {
    // Variables privadas de cada uno de los elementos del Jframe
    private JTextField numField1, numField2; 
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnSalir;
    private JLabel lblResultado, lblMensaje1, lblMensaje2;

    // Esta clase se encarga de confi
    public Calculadora() {
        
        setTitle("Calculadora");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        btnSalir = new JButton("Salir");
        lblResultado = new JLabel();
        lblMensaje1 = new JLabel("Ingresa un número entero");
        lblMensaje2 = new JLabel("Ingresa un número entero");

       
        add(lblMensaje1);
        add(numField1);
        add(lblMensaje2);
        add(numField2);
        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
        add(lblResultado);
        add(btnSalir);

        
        btnSumar.addActionListener(new SumarListener());
        btnRestar.addActionListener(new RestarListener());
        btnMultiplicar.addActionListener(new MultiplicarListener());
        btnDividir.addActionListener(new DividirListener());
        btnSalir.addActionListener(new SalirListener());
    }

    
    private class SumarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int resultado = Operaciones.sumar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

 
    private class RestarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int resultado = Operaciones.restar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

   
    private class MultiplicarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int resultado = Operaciones.multiplicar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private class DividirListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());

                if (num2 == 0) {
                    throw new ArithmeticException("No es posible dividir entre cero");
                }

                int resultado = Operaciones.dividir(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private class SalirListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}


class Operaciones {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
