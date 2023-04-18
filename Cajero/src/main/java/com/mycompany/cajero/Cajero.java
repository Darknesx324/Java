/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cajero;

import java.util.Scanner;
import javax.swing.*;



public class Cajero {
    
    int saldo = 250000;
    String nombre;
    String cedula;
    int TipoC;
    
   public void Ahorros(){
       
       if (TipoC==1){
          
       int interes = (int) (saldo * 0.10 /100);
       Integer.parseInt("El nuevo saldo de la cuenta es de: "+interes);
           
       }
       
       
       
   }
    
    
    
    
    

    public static void main(String[] args) {
        
        
        Scanner sn = new Scanner(System.in);
        Cajero ca = new Cajero();
       
        
        boolean salir = false;
        int Operaciones;
         
        while (!salir){
            
            System.out.println("1. Ahorros");
            System.out.println("2. Corriente");
            System.out.println("3. CDT");
            System.out.println("4. Prestamo");
            System.out.println("5. Salir");
            
            System.out.println(" Digite la opcion que desea realizar: ");
            Operaciones = sn.nextInt();
            
            
            switch(Operaciones){
                
                case 1:
                    ca.Ahorros();
                break;
                 case 2:
                break;
                 case 3:
                break;
                 case 4:
                break;
                 case 5:
                break;
                
            }
            
            
        }
        
        
        
        
        
        
        
    }
}
