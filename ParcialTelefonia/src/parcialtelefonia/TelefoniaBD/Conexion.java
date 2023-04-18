/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialtelefonia.TelefoniaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cisne
 */
public class Conexion {
   String strConexionDB="jdbc:sqlite:C:/Users/user/Desktop/db/TelefoniaA.s3db";
    
    Connection conn = null; 
    
    public Conexion(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion Establecida");
            
        } catch (Exception e) {
            System.out.println("Error de conexion"+e);
            
        }
        
        
        
    }
    public int ejecutarSentenciaSQL(String strSetenciaSQL){
    
       try {
           
           PreparedStatement pstm = conn.prepareStatement(strSetenciaSQL);
           
           pstm.execute();
           return 1;
           
       } catch (SQLException e) {
           
           System.out.println(e);
           return 0;
       }
    
    
       
       
}
    public ResultSet consultarRegistros(String strSetenciaSQL){
       
       try {
            PreparedStatement pstm = conn.prepareStatement(strSetenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
           
       } catch (Exception e) {
           
            System.out.println(e);
            return null;
       }
       
   }
}
