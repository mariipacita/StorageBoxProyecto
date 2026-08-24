/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espacios;

    




/**
 *
 * @author PC
 */
public class espacio {
    
    
   
    private double tamaño;
     TipoEspacioEnum Tipoespacio;
     private int PrecioMensual;
     private int id_Espacio;
     private boolean disponibilidad;

    public espacio( double tamaño, TipoEspacioEnum Tipoespacio, int PrecioMensual, int id_Espacio) {
        
        this.tamaño = tamaño;
        this.Tipoespacio = Tipoespacio;
        this.id_Espacio = id_Espacio;
        this.PrecioMensual = PrecioMensual;
        
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

    

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecioMensual(int PrecioMensual) {
        this.PrecioMensual = PrecioMensual;
    }

        public int getId_Espacio() {
            return id_Espacio;
        }
    
    
     
     
    
    public boolean tamañoAprox(){
          if (tamaño<=20 && tamaño >=5) return true;
        else{
            throw new IllegalArgumentException("Tamaño de mueble no admitido");
        }  
          
          
       
    }
    
    public TipoEspacioEnum espacioPorTamaño(){
        if (tamaño <= 5){ return Tipoespacio.PEQUENO;}
        if (tamaño >= 5 && tamaño <=10) {return Tipoespacio.MEDIANO;}
        if (tamaño >= 10 && tamaño <=20) {return Tipoespacio.GRANDE;}
        else{
            throw new IllegalArgumentException("Espacio no apto ");
        } 
        
    }
   
    public int cobroMensual(int days, int extraDays){
        if(days <=30)PrecioMensual = 2500; 
        if(days<=60) PrecioMensual= 45000;
        if(days<=90)PrecioMensual= 70000;
        else{
            extraDays= days - 90;
            PrecioMensual=70000* 1500;
        }
        
        return PrecioMensual;
        
        
        
    }
   
    public void ActualizarEspacio(TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño ){
        this.Tipoespacio = newTipoEspacio;
        this.PrecioMensual = newPrecio;
        this.tamaño= newTamaño;
        
    
     
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
