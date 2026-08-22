/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;


/**
 *
 * @author sharys
 */
public class Empleado {
    private String identificacion;
    private String nombre;
    private String telefono;
    private PuestoEmpleado puesto;
    private double salario;
    
    
    public Empleado(String identificacion, String nombre, String telefono, PuestoEmpleado puesto){
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public PuestoEmpleado getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoEmpleado puesto) {
        this.puesto = puesto;
    
    }

    public double getSalario() {
        return salario;
    }

    public void actualizarEmpleado(String nombre, String telefono, PuestoEmpleado puesto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = puesto.getSalario();
    }
}
