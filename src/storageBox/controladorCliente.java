/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;
import Clientes.cliente;
import Clientes.clientesList;
/**
 *
 * @author PC
 */
public class controladorCliente {
    
    private Clientes.clientesList listaCliente;
    private Clientes.cliente cliente;

    public controladorCliente(clientesList listaCliente, cliente cliente) {
        this.listaCliente = listaCliente;
        this.cliente = cliente;
    }

    public clientesList getListaCliente() {
        return listaCliente;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setListaCliente(clientesList listaCliente) {
        this.listaCliente = listaCliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    public boolean AddClienteC(cliente cliente){
       return listaCliente.addCliente(cliente);
       
    }
    
    
    public boolean clientRemoveC(String cedula){
        return listaCliente.removeCliente(cedula);
    }
    
    public void UpdateClienteC(String newTelefono,String newCorreo, String newNombre){
        cliente.ActualizarCliente(newTelefono, newCorreo, newNombre);
    
    }
    
    public  boolean FindCliente(String nombre,String telefono,String correo,String filtro){
     boolean encontrar;
     
     switch(filtro){
         case "nombre" : nombre  = cliente.getNombre();
         break;
         
         case "Telefono" : telefono = cliente.getNumTelefonico();
         break;
         
         case "correo" : correo = cliente.getCorreo();
         break;
           
         
             
                 
     }
    
     if(encontrar){
         return 
     }  
     
    }
    
    
    
    
    
    
    
}
