/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;

import Clientes.cliente;
import Clientes.clientesList;
import Espacios.TipoEspacioEnum;
import Espacios.espacio;
import Espacios.espacioList;
import contratos.Contrato;
import contratos.ListaContratos;
import empleados.Empleado;
import empleados.ListaEmpleados;
import empleados.PuestoEmpleado;
import java.util.Iterator;

/**
 *
 * @author marii
 */
public class StorageBox {
    private ListaContratos contratos;
    private ListaEmpleados empleados;
     private Clientes.clientesList listaCliente;
     private Clientes.cliente cliente;
     private Espacios.espacio espacio;
     private Espacios.espacioList espacios;

    public StorageBox(ListaContratos contratos, ListaEmpleados empleados, clientesList listaCliente, cliente cliente, espacio espacio, espacioList espacios) {
        this.contratos = contratos;
        this.empleados = empleados;
        this.listaCliente = listaCliente;
        this.cliente = cliente;
        this.espacio = espacio;
        this.espacios = espacios;
    }
    

   

    public boolean addContrato(Contrato contrato) {
        return contratos.add(contrato);
    }

    public Contrato findContrato(int numeroContrato) {
        return contratos.get(numeroContrato);
    }

    public Iterator<Contrato> getContratos() {
        return contratos.getAll();
    }
    public boolean addEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }

    public Empleado findEmpleado(String identificacion) {
        return empleados.get(identificacion);
    }
    
    public boolean removeEmpleado(String identificacion) {
    return empleados.remove(identificacion);
    }

    public boolean actualizarEmpleado(String identificacion,
            String nombre,
            String telefono,
            PuestoEmpleado puesto) {

        return empleados.actualizarEmpleado (identificacion, nombre, telefono, puesto);
    }

    public Iterator<Empleado> getEmpleados() {
        return empleados.getAll();
    }
    //cliente
    public Iterator<cliente> getCliente(){
        return listaCliente.getAll();
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
    
    
    public cliente findCliente(String cedula){
        return listaCliente.ObtenrKey(cedula);
    }
    
//espacio
    public boolean addEspacio(espacio newEspacio, String id_espacio){
        return espacios.addEspacio(newEspacio, id_espacio);
    }
    
    public boolean removeEspacio(String id_Espacio){
        return espacios.removeEspacio(id_Espacio);
    }
    
    public void updateEspacio(TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño){
        espacio.ActualizarEspacio(newTipoEspacio, newPrecio, newTamaño);
        
    }
    
    public espacio FindEspacio(int id_Espacio){
        return espacios.ObtenrKey(id_Espacio);
    }
    
    public Iterator<espacio> AllEspacios(){
        return espacios.getAll();
    }
    
    public TipoEspacioEnum espacioPorTamaño(double tamaño){
        return espacio.espacioPorTamaño();
        
    }
    public boolean tamañoAprox(double tamaño){
        return espacio.tamañoAprox();
    }
  public int cobroMensual(int days, int extraDays){
      return espacio.cobroMensual(days, extraDays);
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

