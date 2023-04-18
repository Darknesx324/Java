/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.egresadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class conexion2 {
    
    Connection conectar = null;
    
    String user = "root";
    String contraseña = "root";
    String bd = "Proyecto_integrador";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    
    public Connection establecerConexion(){
        
        try {
            
            Class.forName("com.mysql.jdb.Driver");
            
            conectar = DriverManager.getConnection(cadena,user,contraseña);
            JOptionPane.showMessageDialog(null,"Se ha establecido la conexion de manera correcta");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se ha conectado a la base de datos" +e.toString());
        }
        return conectar;
    }
    
    
    
    public int ejecutarSentenciaSQL(String strSetenciaSQL){
    
       try {
           
           PreparedStatement pstm = conectar.prepareStatement(strSetenciaSQL);
           
           pstm.execute();
           return 1;
           
       } catch (SQLException e) {
           
           System.out.println(e);
           return 0;
       }
    
    
       
       
}
    
  public ResultSet consultarRegistros(String strSetenciaSQL){
       
       try {
            PreparedStatement pstm = conectar.prepareStatement(strSetenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
           
       } catch (Exception e) {
           
            System.out.println(e);
            return null;
       }
       
   }  
    
    
    
    
    
}
