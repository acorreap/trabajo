/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradima.producto;

import cl.unab.vina.paradima.utilidades.ConectorDB;


/**
 *
 * @author Alumno
 */
public class Controlador {
    ConectorDB coneccion = new ConectorDB();
    ProductoDAO productoDAO = new ProductoDAO();

    
    public void imprimir(String nombre,float precio){
        System.out.println(nombre);
        System.out.println(precio);
    }
    public void crearProducto(String nombre, float precio){
        Producto producto = new Producto(nombre,precio);
        productoDAO.ingresarDB(nombre,precio);


    }
}
