/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;
import Clientes.cliente;
import Espacios.TipoEspacioEnum;
import Espacios.espacio;
import contratos.Contrato;
import empleados.Empleado;
import empleados.PuestoEmpleado;
import excepciones.EstadoContratoException;
import java.time.LocalDate;
import java.util.Iterator;
import servicios.Servicio;

/**
 *
 * @author marii
 */
public class StorageBoxController {
    private StorageBox storageBox;
    private Views view;
    private static StorageBoxController controller;

    public StorageBox getStorageBox() {
        return storageBox;
    }

    public Views getView() {
        return view;
    }

    public static StorageBoxController getController() {
        return controller;
    }

    public void setView(Views view) {
        this.view = view;
    }

    public static StorageBoxController getInstance(Views view) {

        if (controller == null) {
            controller = new StorageBoxController(view);
        }

        return controller;
    }

    private StorageBoxController(Views view) {
        this.storageBox = new StorageBox();
        this.view = view;
    }
    
//    Contrato
     public boolean addContrato(Contrato contrato) {

        boolean status = storageBox.addContrato(contrato);

        if (status) {
            view.showMessage("Contrato agregado correctamente");
        } else {
            view.showError("No se pudo agregar el contrato");
        }
        return status;
    }
     
    public Contrato findContrato(int numeroContrato) {
        Contrato contrato = storageBox.findContrato(numeroContrato);

        if (contrato == null) {
            view.showError(
                    "No se encontró el contrato número: " + numeroContrato
            );
        } else {
            view.showData(contrato);
        }
        return contrato;
    }

    public boolean activarContrato(int numeroContrato) {
    Contrato contrato = storageBox.findContrato(numeroContrato);

    if (contrato == null) {
        view.showError("Contrato no encontrado");
        return false;
    }
    try {
        contrato.activarContrato();
        view.showMessage("Contrato activado correctamente");
        return true;
    } catch (EstadoContratoException e) {
        view.showError(e.getMessage());
        return false;
    }
}
    public boolean finalizarContrato(int numeroContrato) throws EstadoContratoException {
        Contrato contrato = storageBox.findContrato(numeroContrato);

        if (contrato == null) {
            view.showError("Contrato no encontrado");
            return false;
        }
        try {
            contrato.finalizarContrato();
            view.showMessage("Contrato finalizado correctamente");
            return true;

        } catch (IllegalStateException e) {
            view.showError(e.getMessage());
            return false;
        }
    }
    public boolean cancelarContrato(int numeroContrato) throws EstadoContratoException {
        
        Contrato contrato = storageBox.findContrato(numeroContrato);

        if (contrato == null) {
            view.showError("Contrato no encontrado");
            return false;
        }
        try {
            contrato.cancelarContrato();
            view.showMessage("Contrato cancelado correctamente");
            return true;
            
        } catch (IllegalStateException e) {
            view.showError(e.getMessage());
            return false;
        }
    }
    
    public LocalDate convertirFecha(String fechaTexto) {

    if (fechaTexto.isEmpty()) {
        return null;
    }
    try {
        return LocalDate.parse(fechaTexto);
    } catch (Exception e) {
        view.showError("La fecha debe tener el formato AAAA-MM-DD");
        return null;
    }
}
    public Iterator<Contrato> getContratos() {
        return storageBox.getContratos();
}
//    Empleados
    public boolean addEmpleado(Empleado empleado) {
    boolean status = storageBox.addEmpleado(empleado);

    if (status) {
        view.showMessage("Empleado agregado correctamente");
    } else {
        view.showError("No se pudo agregar el empleado");
    }

    return status;
   }
    
    public Empleado findEmpleado(String identificacion) {
    Empleado empleado = storageBox.findEmpleado(identificacion);

    if (empleado == null) {
        view.showError("Empleado no encontrado");
    } else {
        view.showData(empleado);
    }

    return empleado;
   }
    
   public boolean removeEmpleado(String identificacion) {
   boolean status = storageBox.removeEmpleado(identificacion);

    if (status) {
        view.showMessage("Empleado eliminado correctamente");
    } else {
        view.showError("No se pudo eliminar el empleado");
    }
    return status;
} 
    
    public boolean actualizarEmpleado(String identificacion, String nombre, String telefono, PuestoEmpleado puesto) {
    boolean status = storageBox.actualizarEmpleado(identificacion, nombre, telefono, puesto);

    if (status) {
        view.showMessage("Empleado actualizado correctamente");
    } else {
        view.showError("No se pudo actualizar el empleado");
    }

    return status;
   }
    public Iterator<Empleado> getEmpleados() {
    return storageBox.getEmpleados();
  }
    
      
    //cliente
    public boolean addCliente(cliente client){
        boolean cliente = storageBox.AddClienteC(client);
        if(cliente){
            view.showMessage("Cliente agregado correctamente");
        }else{
            view.showError("Cliente no fue agregado correctamente");
        }
        return cliente;
    }
    
    public boolean removeCliente(String cedula){
        boolean cliente = storageBox.removeEmpleado(cedula);
        if (cliente) {
        view.showMessage("Cliente eliminado correctamente");
    } else {
        view.showError("Cliente no fue eliminado correctamente");
    }
    return cliente; 
    }
    
    public cliente findCliente(String cedula){
        cliente cliente = storageBox.findCliente(cedula);
         if (cliente == null) {
        view.showError("Empleado no encontrado");
    } else {
        view.showData(cliente);
    }
         return cliente;
    }
    
    public void actulizarCliente(String Telefono,String Correo, String Nombre){
     
              storageBox.UpdateClienteC(Telefono, Correo, Nombre);
    }   
    
    public Iterator<cliente> getClientes(){
        return storageBox.getCliente();
    }
    
    public int calcularEdad(String cedula){
        cliente cliente = storageBox.findCliente(cedula);
        
        if(cliente == null){
            view.showError("Cliente no encontrado");
        }
        return cliente.getEdad();
    }
    
    //esapcios
    
    public boolean addEspacio(espacio espacio,String id_espacio){
        boolean espacios = storageBox.addEspacio( espacio,id_espacio);
        if(espacios){
            view.showMessage("Esapcio agregado correctamente");
        }else{
            view.showError("Espacio no agregado correctamente");
        }
        return espacios;
    }
    
    public boolean removeEspacio(String id_Espacio){
        boolean espacio = storageBox.removeEspacio(id_Espacio);
        if (espacio) {
        view.showMessage("Espacio eliminado correctamente");
    } else {
        view.showError("esapcio no eliminado correctamente");
    }
    return espacio; 
    }
    
  public espacio findEspacio(int id_Espacio){
      
      espacio espacio = storageBox.FindEspacio(id_Espacio);
         if (espacio == null) {
        view.showError("Espacio inexistente");
    } else {
        view.showData(espacio);
    }
         return espacio;
    }
    
    public void actualizarEspacio(TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño){
        storageBox.updateEspacio(newTipoEspacio, newPrecio, newTamaño);
    }
    
    public Iterator<espacio> getEspacios(){
        return storageBox.AllEspacios();
    }
    
    public TipoEspacioEnum tipoEspacio(double tamaño){
        return storageBox.espacioPorTamaño(tamaño);
        
    }
    
   public boolean tamañoAprox(double tamaño){
        return storageBox.tamañoAprox(tamaño);
    }  
    
    public int cobroMensual(int days, int extraDays){
        return storageBox.cobroMensual(days, extraDays);
        
    }
//    Servicios
    public boolean addServicio(Servicio servicio) {
    boolean status = storageBox.addServicio(servicio);

    if (status) {
        view.showMessage("Servicio agregado correctamente");
    } else {
        view.showError("No se pudo agregar el servicio");
    }
    return status;
}
    
    public Servicio findServicio(int codigo) {
    Servicio servicio = storageBox.findServicio(codigo);

    if (servicio == null) {
        view.showError("Servicio no encontrado");
    } else {
        view.showData(servicio);
    }

    return servicio;
}
    public boolean removeServicio(int codigo) {
    boolean status = storageBox.removeServicio(codigo);

    if (status) {
        view.showMessage("Servicio eliminado correctamente");
    } else {
        view.showError("No se pudo eliminar el servicio");
    }
    return status;
}
    public boolean actualizarServicio(int codigo, String descripcion, double precio) {
    boolean status = storageBox.actualizarServicio(codigo, descripcion, precio);

    if (status) {
        view.showMessage("Servicio actualizado correctamente");
    } else {
        view.showError("No se pudo actualizar el servicio");
    }
    return status;
}
    public Iterator<Servicio> getServicios() {
      return storageBox.getServicios();
}
    
    
      
}

