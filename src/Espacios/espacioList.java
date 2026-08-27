/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espacios;


import excepciones.EspacioOcupadoException;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author PC
 */
public class espacioList {
    protected HashMap<Integer,espacio>espacios;

    public espacioList() {
        this.espacios = new HashMap<>();
    }
    
    
    
    
    
    
    
     public boolean addEspacio(espacio newEspacio){
       
        if (espacios.containsKey(newEspacio.getId_Espacio())) return false;
   return espacios.put(newEspacio.getId_Espacio(), newEspacio)==null;
        

       
    }
     
     
     public espacio ObtenrKey(int Id_Espacio){
        return this.espacios.get(Id_Espacio);
    }
    
   
    
    public boolean removeEspacio(int id_Espacio) throws EspacioOcupadoException{
        espacio espacio = ObtenrKey(id_Espacio);
        
        if (espacio == null) {
            return false;
        }
        
        if (!espacio.isDisponible()) {
            throw new EspacioOcupadoException(
                    "No se puede eliminar un espacio ocupado"
            );
        }
        return espacios.remove(id_Espacio) != null;
    }    
    
    
    public Iterator<espacio> getAll(){
     if (espacios.isEmpty()) {
            return null;
        }

        return espacios.values().iterator();
    }
}
    

