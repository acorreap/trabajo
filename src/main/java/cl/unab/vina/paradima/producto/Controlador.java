/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.producto;

import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Alumno
 */
public class Controlador {
    ProductoDAO productoDAO = new ProductoDAO();

    
    public void crearProductoModelo(String nombre, float precio){
        try{
        Producto producto = new Producto(productoDAO.obtenerIdMax()+1,nombre,precio);
        VistaMensaje producto_creado = new VistaMensaje();
        producto_creado.getLabel().setText("Producto Creado Correctamente");
        producto_creado.setLocationRelativeTo(producto_creado);
        producto_creado.setVisible(true);
        }
        catch(Exception e){
            System.out.println("Error");
            
        }
    }
    public void ingresarNuevoProductoDB(String Nombre, float precio){
        productoDAO.ingresarDB(Nombre, precio);
    }

    
}
