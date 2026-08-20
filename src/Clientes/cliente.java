/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author PC
 */
public class cliente {
     protected String cedula;
     protected String nombre;
    protected LocalDate fechaNacimient;
    protected String correo;
    protected String numTelefonico;
    protected int edad;

    public cliente(String cedula, String nombre, LocalDate fechaNacimient, String correo, String numTelefonico, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimient = fechaNacimient;
        this.correo = correo;
        this.numTelefonico = numTelefonico;
        this.edad = edad;
    }

    
    
    public int getEdad() {
        return calcularEdad();
   
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimient() {
        return fechaNacimient;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }
  
   public void ActualizarCliente(String newTelefono,String newCorreo, String newNombre){
       this.numTelefonico = newTelefono;
       this.correo = newCorreo;
       this.nombre = newNombre;   
   } 
   
    
   public int calcularEdad(){
       return  Period.between(fechaNacimient, LocalDate.now()).getYears();

   } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
