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
    private TipoEspacioEnum Tipoespacio;
     private int PrecioMensual;
     private int id_Espacio;
     private boolean disponible;
    

    public espacio( double tamaño, TipoEspacioEnum Tipoespacio, int PrecioMensual, int id_Espacio) {
        
        this.tamaño = tamaño;
        this.Tipoespacio = Tipoespacio;
        this.id_Espacio = id_Espacio;
        this.PrecioMensual = PrecioMensual;
        this.disponible = true;
        
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
    
    public boolean isDisponible() {
        return disponible;
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
            throw new IllegalArgumentException("Espacio no apto para el espacio ");
        } 
        
    }
   
    public void asignarDatosPorTipo() {

    if (Tipoespacio == TipoEspacioEnum.PEQUENO) {
        tamaño = 5;
        PrecioMensual = 25000;
    }

    if (Tipoespacio == TipoEspacioEnum.MEDIANO) {
        tamaño = 10;
        PrecioMensual = 45000;
    }

    if (Tipoespacio == TipoEspacioEnum.GRANDE) {
        tamaño = 20;
        PrecioMensual = 70000;
    }
    }
        
    public void ocupar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }
        
        
   
    public void ActualizarEspacio(TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño ){
        this.Tipoespacio = newTipoEspacio;
        this.PrecioMensual = newPrecio;
        this.tamaño= newTamaño;
        
    
     
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
