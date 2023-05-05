/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.producto;
import cl.unab.vina.paradima.utilidades.ConectorDB;
import java.sql.*;

/**
 *
 * @author Alumno
 */
public class ProductoDAO {
    ConectorDB conexion = new ConectorDB();
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public void ingresarDB(String nombre, float precio) {
        String query = "insert into productos (nombre, precio) values(?,?)";
        try{
            PreparedStatement preparedStmt = conexion.obtenerConeccion().prepareStatement(query);
            preparedStmt.setString(1,nombre);
            preparedStmt.setFloat(2, precio);
            preparedStmt.execute();
            
            
            System.out.println("Se ha creado el producto");
            System.out.println(preparedStmt);
            conexion.cerrar();
            
        } catch(SQLException e){
            System.out.println(e);
        }        
    }
    public int obtenerIdMax(){
        String query = "SELECT MAX(idproductos) FROM productos";
        int id;
        try{
            PreparedStatement preparedStmt = conexion.obtenerConeccion().prepareStatement(query);
            ResultSet result_set = preparedStmt.executeQuery();
            result_set.next();
            id = result_set.getInt(1);
            return id;
        }
        catch(SQLException e){
            System.out.println(e);
            return -1;
        }
      
}

    
}
