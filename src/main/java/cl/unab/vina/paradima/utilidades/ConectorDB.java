/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class ConectorDB {

    private static Connection connect = null;

    public static Connection obtenerConeccion() {
        if (connect != null) return connect;
        
        return conectarse();
    }
    
    private static Connection conectarse() {
        String base_de_datos = "almacen";
        
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+base_de_datos,"root", "root");
            System.out.println("Conexion exitosa");
        }
            
        catch(SQLException e) {
            System.out.println(e);
        }
        return connect;
    }
    public static void cerrar() throws SQLException {
        if (connect != null) {
        connect.close();
        }                   
    }

}
