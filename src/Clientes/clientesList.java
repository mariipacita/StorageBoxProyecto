/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.HashMap;

/**
 *
 * @author PC
 */
public class clientesList {
    protected HashMap<String,cliente>clientes;

    public clientesList(HashMap<String, cliente> clientes) {
        this.clientes = clientes;
        
    }
    
    
    public boolean addCliente(cliente newCliente){
       
        if(clientes.containsKey(newCliente.getCedula())) return false;
        return clientes.put(newCliente.getCedula(), newCliente) == null;
        
    }
    
    public cliente ObtenrKey(String Cedula){
        return this.clientes.get(Cedula);
        
        
    }
    
    public boolean removeCliente(String cedulant){
         return this.clientes.remove(cedulant)!=null;
    }
    
    
    
    
    
    
    
    
    
}
