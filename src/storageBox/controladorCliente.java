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
    
    
    
    
    
    
    
    
    
}
