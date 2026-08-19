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
    private String puesto;
    private double salario;
    
    public Empleado(){
        
    }
    
    public Empleado(String identificacion, String nombre, String telefono, String puesto){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        
        calcularSalario();
    }
    
    public void calcularSalario(){
        switch(puesto){
            case "Administrador":
            salario = 950000;
            break;
            
            case "Recepcionista":
            salario = 700000;
            break;
            
            case "Encargado de bodega":
            salario = 650000;
            break;
            
            case "Mantenimiento":
            salario = 600000;
            break;
            
            case "Operario de carga":
            salario = 575000;
            break;
            
            default: 
                salario = 0;
                break;
        }
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
        calcularSalario();
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
    return identificacion + "-" + nombre + "-" + puesto;
        
    }

}
