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

    public espacio( double tamaño, TipoEspacioEnum Tipoespacio, int PrecioMensual, int id_Espacio) {
        
        this.tamaño = tamaño;
        this.Tipoespacio = Tipoespacio;
        this.id_Espacio = id_Espacio;
        this.PrecioMensual = PrecioMensual;
        
    }

    public int getId_Espacio() {
        return id_Espacio;
    }

        public void setId_Espacio(int id_Espacio) {
            this.id_Espacio = id_Espacio;
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
       
        } 
        //preguntae sobre esto
        
        
        
        
    }
    
     
    public void ActualizarEspacio(TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño ){
        
        
    
     
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
