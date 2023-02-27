
package Poo2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Robs
 */
public class ConexionDB {
   Connection conexion = null;
   String usuario = "", pass = "", bd = "sistema_programacion", ip = "localhost", port = "3306";
   String cconexion = "jdbc:mysql://"+ ip + ":" + port + "/" + bd;
   
   public Connection conectar(){
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion=DriverManager.getConnection(cconexion, usuario, pass);
           
           
       } 
       catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión \n" + e.toString());
       }
       
       return conexion;
    }
   
}
