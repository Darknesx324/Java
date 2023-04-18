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
public class Ciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> Ciudad;
        Ciudad = new ArrayList<>();
        
        Ciudad.add("Cali");
        Ciudad.add("Popayán");
        Ciudad.add("Pasto");
        Ciudad.add(1, "Medellin");
        
        Ciudad.remove(1);
        
        //System.out.println(Ciudad.get(1));
         for (int i = 0; i < Ciudad.size(); i++) {
             System.out.println(Ciudad.get(i));
            
        }
        
        
        
        
    }
    
}
