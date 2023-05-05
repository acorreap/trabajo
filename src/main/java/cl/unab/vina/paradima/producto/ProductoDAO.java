/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.producto;
import java.sql.*;

/**
 *
 * @author Alumno
 */
public class ProductoDAO {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void conectarse() {
        String base_de_datos = "almacen";
        try {
            this.connect = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/"+base_de_datos,
            "root", "Unab.2023");
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            
    }  
    public void crearProducto(String nombre, float precio) {
        String query = "insert into productos (nombre, precio) values("+nombre+","+ precio +")";
        try{
            PreparedStatement preparedStmt = this.connect.prepareStatement(query);
            preparedStmt.setString(1,nombre);
            preparedStmt.setFloat(2, precio);
            preparedStmt.execute();
            
            
            System.out.println("Se ha creado el producto");
            System.out.println(preparedStmt);
            
        } catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
}
