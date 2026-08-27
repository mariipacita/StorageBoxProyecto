/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;
import Clientes.cliente;
import Espacios.TipoEspacioEnum;
import Espacios.espacio;
import contratos.Contrato;
import contratos.EstadoContrato;
import empleados.Empleado;
import empleados.PuestoEmpleado;
import excepciones.ClienteConContratoException;
import excepciones.EspacioOcupadoException;
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
    public boolean finalizarContrato(int numeroContrato) {
    Contrato contrato = storageBox.findContrato(numeroContrato);

    if (contrato == null) {
        view.showError("Contrato no encontrado");
        return false;
    }
    try {
        contrato.finalizarContrato();
        view.showMessage("Contrato finalizado correctamente");
        return true;

    } catch (EstadoContratoException e) {
        view.showError(e.getMessage());
        return false;
    }
}
    public boolean cancelarContrato(int numeroContrato) {
    Contrato contrato = storageBox.findContrato(numeroContrato);

    if (contrato == null) {
        view.showError("Contrato no encontrado");
        return false;
    }
    try {
        contrato.cancelarContrato();
        view.showMessage("Contrato cancelado correctamente");
        return true;

    } catch (EstadoContratoException e) {
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
        
      cliente existente = storageBox.findCliente(client.getCedula());
      if (existente != null) {
        view.showError("Ya existe un cliente con esa identificación");
        return false;
    }
        
        boolean cliente = storageBox.AddClienteC(client);
        if(cliente){
            view.showMessage("Cliente agregado correctamente");
        }else{
            view.showError("Cliente no fue agregado correctamente");
        }
        return cliente;
    }
    
    public boolean removeCliente(String cedula) throws ClienteConContratoException{
       try {
        Iterator<Contrato> iterator = storageBox.getContratos();

        if (iterator != null) {

        while (iterator.hasNext()) {

          Contrato contrato = iterator.next();

        if (contrato.getCliente().getCedula().equals(cedula) && (contrato.getEstado() == EstadoContrato.PENDIENTE || contrato.getEstado() == EstadoContrato.ACTIVO)) {

             throw new ClienteConContratoException(
                            "No se puede eliminar el cliente porque tiene contratos pendientes o activos");
                }
            }
        }

        boolean status = storageBox.clientRemoveC(cedula);

        if (status) {
            view.showMessage("Cliente eliminado correctamente");
        } else {
            view.showError("Cliente no encontrado");
        }
        return status;

    } catch (ClienteConContratoException e) {
        view.showError(e.getMessage());
        return false;
    } 
    }
    
    public cliente findCliente(String cedula){
        cliente cliente = storageBox.findCliente(cedula);

    if (cliente == null) {
        view.showError("Cliente no encontrado");
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
    
    public boolean addEspacio(espacio espacio){
        boolean status = storageBox.addEspacio(espacio);
        if(status){
            view.showMessage("Espacio agregado correctamente");
        }else{
            view.showError("Espacio no agregado correctamente");
        }
        return status;
    }
    
    public boolean removeEspacio(int id_Espacio){
        try {

        boolean status = storageBox.removeEspacio(id_Espacio);

        if (status) {
            view.showMessage(
                    "Espacio eliminado correctamente"
            );
        } else {
            view.showError(
                    "Espacio no encontrado"
            );
        }
        return status;

    } catch (EspacioOcupadoException e) {
        view.showError(e.getMessage());
        return false;
    } 
    }
    
  public espacio findEspacio(int id_Espacio){
      
       espacio espacio = storageBox.FindEspacio(id_Espacio);

    if (espacio == null) {
        view.showError("Espacio inexistente");
    }

    return espacio;
    }
    
    public boolean actualizarEspacio(int id_Espacio,TipoEspacioEnum newTipoEspacio,int newPrecio, double newTamaño){
        boolean status = storageBox.updateEspacio(id_Espacio, newTipoEspacio, newPrecio,newTamaño);

    if (status) {
        view.showMessage(
                "Espacio actualizado correctamente"
        );
    } else {
        view.showError(
                "Espacio no encontrado"
        );
    }
    return status;
    }
    
    public Iterator<espacio> getEspacios(){
        return storageBox.AllEspacios();
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

