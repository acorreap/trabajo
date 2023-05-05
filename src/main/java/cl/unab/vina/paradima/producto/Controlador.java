/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.producto;



/**
 *
 * @author Alumno
 */
public class Controlador {
    ProductoDAO productoDAO = new ProductoDAO();

    
    public void imprimir(String nombre,float precio){
        System.out.println(nombre);
        System.out.println(precio);
        productoDAO.obtenerIdMax();
    }
    public void crearProductoModelo(String nombre, float precio){
        Producto producto = new Producto(productoDAO.obtenerIdMax()+1,nombre,precio);
    }
    public void ingresarNuevoProductoDB(String Nombre, float precio){
        productoDAO.ingresarDB(Nombre, precio);
    }

    
}
