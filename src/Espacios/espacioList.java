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
    private HashMap<Integer,espacio>espacios;

        public espacioList(HashMap<Integer, espacio> espacios) {
            this.espacios = espacios;
        }

   
    
    
    
    
    
    
    
     public boolean addEspacio(espacio newEspacio, String id_espacio){
       
if (espacios.containsKey(newEspacio.g)) return false;
   return espacios.put(newEspacio.getId_Espacio(), newEspacio)==null;
        

       
    }
     
     
     public void ObtenrKey(String Id_Espacio){
      
        
    }
    }
    
   
    
    public boolean removeEspacio(String id_Espacio){
        return espacios.remove(id_Espacio) != null;
    }    
    
    
}
