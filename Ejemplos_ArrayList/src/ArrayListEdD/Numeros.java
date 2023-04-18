/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListEdD;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //ArrayList<Integer> Numero = new ArrayList<>();
       ArrayList<Integer> Numero;
       Numero = new ArrayList<>();
       
       Numero.add(2);
       Numero.add(3);
       Numero.add(5);
       Numero.add(7);
       Numero.add(13);
       Numero.add(4, 11);
       
       //remover un elemento
       Numero.remove(3);// elimina por el indice
             
       
        for (int i = 0; i < Numero.size(); i++) {
            System.out.println(Numero.get(i));
          
        }
        System.out.println("El tamano del arreglo es: " + Numero.size());
       
  
      
        
        
    }
    
}
