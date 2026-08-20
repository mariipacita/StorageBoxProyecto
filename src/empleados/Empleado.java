/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import nulls.Puesto;

/**
 *
 * @author sharys
 */
public class Empleado {
    private String identificacion;
    private String nombre;
    private String telefono;
    private Puesto puesto;
    private double salario;
    
    public Empleado(){
        
    }
    
    public Empleado(String identificacion, String nombre, String telefono, Puesto puesto){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = puesto.getSalario();
            
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
    return identificacion + "-" + nombre + "-" + puesto;
        
    }

}
