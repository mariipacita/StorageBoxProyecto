/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EspaciosDeAlmacenamiento;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author PC
 */
public class espacio {
    
    private HashMap<Integer,String>numEspacios;
   
    private double tamaño;
     TipoEspacioEnum Tipoespacio;
     private int PrecioMensual;
     private String id_Espacio;

    public espacio(HashMap<Integer,String> numEspacios, double tamaño, TipoEspacioEnum Tipoespacio, int PrecioMensual) {
        this.numEspacios = new HashMap<>();
        this.tamaño = tamaño;
        this.Tipoespacio = Tipoespacio;
        this.PrecioMensual = PrecioMensual;
    }

    
     
     
     
     
  

    public HashMap<Integer, String> getNumEspacios() {
        return numEspacios;
    }

    public double getTamaño() {
        
        
        return tamaño;
    }

    public TipoEspacioEnum getTipoespacio() {
        return Tipoespacio;
    }

    public int getPrecioMensual() {
        return PrecioMensual;
    }

    public void setNumEspacios(HashMap<Integer,String> numEspacios) {
        this.numEspacios = numEspacios;
    }

    

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecioMensual(int PrecioMensual) {
        this.PrecioMensual = PrecioMensual;
    }
     
     
    
    public boolean tamañoAprox(){
          if (tamaño<=20 && tamaño >=5) return true;
        else return false;
          
          
       
    }
    
    
    public TipoEspacioEnum espacioPorTamaño(){
        if (tamaño <= 5){ return Tipoespacio.PEQUENO;}
        if (tamaño >= 5 && tamaño <=10) {return Tipoespacio.MEDIANO;}
        if (tamaño >= 10 && tamaño <=20) {return Tipoespacio.GRANDE;}
        else{
            throw new IllegalArgumentException("Tamaño de mueble no admitido");
        } 
        
    }
    
    
    public int precioMensual(){
        if(PrecioMensual==30) return 25000;
        if(PrecioMensual==60) return 45000;
        if(PrecioMensual==90) return 70000;
        else {
            throw new IllegalArgumentException(" fecha");
        } 
        //preguntae sobre esto
        
        
        
        
    }
    
    public boolean AgregarEspacio(Integer num, String nom){
        
         if (numEspacios.containsKey(num))  return false;
         else numEspacios.put(num, nom); return true;
         
      
        
    }
    
    
    public void ActualizarEspacio(){
    
    
    }
    
    
    
    public boolean EliminarEspacio(Integer num){
        if (numEspacios.containsKey(num)){
           numEspacios.remove(num);
           return true; 
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
