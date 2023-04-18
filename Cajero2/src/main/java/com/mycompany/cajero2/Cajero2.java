

package com.mycompany.cajero2;

import javax.swing.*;

public class Cajero2 {
    
    String Nombre;
    String Cedula;
    int Tipo_Cuenta;
    int intereses;
    int saldo=250000;
    
    
    
  public void Cuenta(){
      
      Nombre = JOptionPane.showInputDialog(" Digite el nombre de propietario de la cuenta: ");
      Cedula = JOptionPane.showInputDialog(" Digite su cedula... ");
      Tipo_Cuenta = Integer.parseInt(JOptionPane.showInputDialog(" Digite el tipo de cuenta a usar: 1. Ahorros 2. Corriente 3. CDT 4. Prestamo"));
      
      
      
  }
  
  public void Cuota_Manejo(){
      int Intereses;
      if (Tipo_Cuenta==1){
          
          Intereses = (int) (saldo * 0.10);
          System.out.println(" El saldo con su nueva cuota es de: "+Intereses);
          
      }
      if (Tipo_Cuenta==2){
          
           Intereses = (int) (saldo * 0.08);
          System.out.println(" El saldo con su nueva cuota es de: "+Intereses);
      }
      
      if (Tipo_Cuenta==3){
           Intereses = (int) (saldo * 0.12);
          System.out.println(" El saldo con su nueva cuota es de: "+Intereses);
          
      }
      if (Tipo_Cuenta==4){
          
          System.out.println(" El saldo con su nueva cuota es de: "+saldo);
          
      }
      
      
  }
  
  


    public static void main(String[] args) {
        
        Cajero2 ca= new Cajero2();
        ca.Cuota_Manejo();
    }
}
