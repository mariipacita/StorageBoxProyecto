/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espacios;


import java.util.HashMap;

/**
 *
 * @author PC
 */
public class espacioList {
    protected HashMap<Integer,espacio>espacios;

    public espacioList() {
        this.espacios = new HashMap<>();
    }
    
    
    
    
    
    
    
     public boolean addEspacio(espacio newEspacio, String id_espacio){
       
        if (espacios.containsKey(newEspacio.getId_Espacio())) return false;
   return espacios.put(newEspacio.getId_Espacio(), newEspacio)==null;
        

       
    }
     
     
     public espacio ObtenrKey(int Id_Espacio){
        return this.espacios.get(Id_Espacio);
    }
    
   
    
    public boolean removeEspacio(String id_Espacio){
        return espacios.remove(id_Espacio) != null;
    }    
    
    
}
