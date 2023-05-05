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
    public void validarDatoNombre(String nombre){
        
    }
    public int conseguirId(){
        
        return 0;        
    }
    
    public void crearProducto(String nombre, float precio){
        int id = conseguirId()+1;
        Producto producto = new Producto(id, nombre,precio);
        
    }
}
