package javaapplication1;

import javax.swing.*;

public class JavaApplication1 {
    
    static  String Nombre;
    static String Cedula;
    static int Tipo_Cuenta;
    static int saldo=250000;
    static double Intereses=0;
    
    public static void Cuenta(){  
        Nombre = JOptionPane.showInputDialog(" Digite el nombre de propietario de la cuenta: ");
        Cedula = JOptionPane.showInputDialog(" Digite su cedula... ");
        Tipo_Cuenta = Integer.parseInt(JOptionPane.showInputDialog(" Digite el tipo de cuenta a usar: 1. Ahorros 2. Corriente 3. CDT 4. Prestamo"));
    }

    public  static void Cuota_Manejo(){
        if (Tipo_Cuenta==1){
            Intereses = (int) (saldo * 0.10);
            JOptionPane.showMessageDialog(null, " El saldo con su nueva cuota es de: " + Intereses);   
        }
        if (Tipo_Cuenta==2){
            Intereses = (int) (saldo * 0.08);
            JOptionPane.showMessageDialog(null, " El saldo con su nueva cuota es de: " + Intereses);
        }
        if (Tipo_Cuenta==3){
            Intereses = (int) (saldo * 0.12);
            JOptionPane.showMessageDialog(null, " El saldo con su nueva cuota es de: " + Intereses);
        }
        if (Tipo_Cuenta==4){
            Intereses = 0;
            JOptionPane.showMessageDialog(null, " El saldo con su nueva cuota es de: " + saldo);    
        }
        else{
            JOptionPane.showMessageDialog(null, saldo);
        }
    }

    public static void LeerDatos(){  
        JOptionPane.showMessageDialog(null, "El saldo del usuario es de: " + Intereses);
    }

    public static void main(String[] args) {
        JavaApplication1.Cuenta();
        JavaApplication1.Cuota_Manejo();
        JavaApplication1.LeerDatos();
    }
}
