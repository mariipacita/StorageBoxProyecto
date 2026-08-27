/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contratos;
import Espacios.espacio;
import Clientes.cliente;
import excepciones.EstadoContratoException;
import excepciones.FechaContratoException;
import java.time.LocalDate;
import java.util.ArrayList;
import servicios.Servicio;

/**
 *
 * @author marii
 */
public class Contrato {
    private static int contadorContratos = 1;
    private int numeroContrato;
    private cliente cliente;
    private espacio espacio;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private EstadoContrato estado;
    private ArrayList<Servicio> servicios;
    private double subtotal;
    private double impuestos;
    private double total;
    
    public Contrato(cliente cliente, espacio espacio, LocalDate fechaInicio,LocalDate fechaFinal) {
    this.numeroContrato = contadorContratos++;
    this.cliente = cliente;
    this.espacio = espacio;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
    this.estado = EstadoContrato.PENDIENTE;
    this.servicios = new ArrayList<>();
    this.subtotal = 0;
    this.impuestos = 0;
    this.total = 0;
    }
    
    public int getNumeroContrato() {
    return numeroContrato;
   }

    public cliente getCliente() {
    return cliente;
   }

    public void setCliente(cliente cliente) {
    this.cliente = cliente;
   }

    public espacio getEspacio() {
    return espacio;
    }

    public void setEspacio(espacio espacio) {
    this.espacio = espacio;
   }

    public LocalDate getFechaInicio() {
    return fechaInicio;
   }

   public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
   }

   public LocalDate getFechaFinal() {
    return fechaFinal;
   }

   public void setFechaFinal(LocalDate fechaFinal) {
    this.fechaFinal = fechaFinal;
   }

   public EstadoContrato getEstado() {
    return estado;
  }

   public ArrayList<Servicio> getServicios() {
    return servicios;
  }

   public double getSubtotal() {
    return subtotal;
  }

   public double getImpuestos() {
    return impuestos;
  }

   public double getTotal() {
    return total;
  }
   
  public void agregarServicio(Servicio servicio) {
    servicios.add(servicio);
 } 
  
  public void eliminarServicio(Servicio servicio) {
    servicios.remove(servicio);
 }
  
  public void validarFechas() throws FechaContratoException {

    if (fechaInicio == null || fechaFinal == null) {
        throw new FechaContratoException(
                "Las fechas del contrato son obligatorias"
        );
    }

    if (fechaFinal.isBefore(fechaInicio)) {
        throw new FechaContratoException(
                "La fecha final no puede ser anterior a la fecha de inicio"
        );
    }

    if (fechaFinal.isEqual(fechaInicio)) {
        throw new FechaContratoException(
                "La fecha final no puede ser igual a la fecha de inicio"
        );
    }
}
  
  public int calcularDias() throws FechaContratoException {

    validarFechas();

    int dias = 0;
    LocalDate fecha = fechaInicio;

    while (fecha.isBefore(fechaFinal)) {
        dias++;
        fecha = fecha.plusDays(1);
    }

    return dias;
}
  
  public int calcularPeriodos(int dias) {
     int periodos = dias / 30;

    if (dias % 30 != 0) {
        periodos++;
    }

    return periodos;
  }

  
  public void calcularCosto() throws FechaContratoException {
    int dias = calcularDias();

    int periodos = calcularPeriodos(dias);

    double costoEspacio = espacio.getPrecioMensual() * periodos;

    double costoServicios = 0;

    for (Servicio servicio : servicios) {
        costoServicios += servicio.getPrecio();
    }

    total = costoEspacio + costoServicios;
    subtotal = total / 1.13;
    impuestos = total - subtotal;
}
  public void activarContrato() throws EstadoContratoException {

    if (estado == EstadoContrato.PENDIENTE) {
        estado = EstadoContrato.ACTIVO;
        espacio.ocupar();
    } else {
        throw new EstadoContratoException(
                "El contrato no se puede activar"
        );
    }
}

  public void finalizarContrato() throws EstadoContratoException {

    if (estado == EstadoContrato.ACTIVO) {
        estado = EstadoContrato.FINALIZADO;
        espacio.liberar();
    } else {
        throw new EstadoContratoException(
                "El contrato no se puede finalizar"
        );
    }
}
  public void cancelarContrato() throws EstadoContratoException {

    if (estado == EstadoContrato.PENDIENTE) {
        estado = EstadoContrato.CANCELADO;
        espacio.liberar();
    } else {
        throw new EstadoContratoException(
                "El contrato no se puede cancelar"
        );
    }
}   
}
