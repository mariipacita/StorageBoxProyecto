/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author sharys
 */
public class Servicio {
    private int codigo;
    private String nombre;
    private String descripcion; 
    private double precio;
    
    public Servicio() {
        
    }
    
    public Servicio(int codigo, String nombre, String descripcion, double precio){
        this.codigo = codigo;
        this. nombre = nombre;
        this.descripcion = descripcion; 
        this.precio = precio;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    @Override
    public String toString(){
        return codigo + "--" + nombre + "- ¢" + precio;
    }
}
