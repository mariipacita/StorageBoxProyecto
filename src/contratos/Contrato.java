/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contratos;

import Clientes.cliente;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author marii
 */
public class Contrato {
    private static int contadorContratos = 1;
    private int numeroContrato;
    private cliente cliente;
    private Espacio espacio;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private EstadoContrato estado;
    private ArrayList<Servicio> servicios;
    private double subtotal;
    private double impuestos;
    private double total;
    
    public Contrato(cliente cliente, Espacio espacio, LocalDate fechaInicio,LocalDate fechaFinal) {
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

    public Espacio getEspacio() {
    return espacio;
    }

    public void setEspacio(Espacio espacio) {
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
  
  public boolean validarFechas() {

    if (fechaInicio == null || fechaFinal == null) {
        return false;
    }

    if (fechaFinal.isBefore(fechaInicio) || fechaFinal.isEqual(fechaInicio)) {
        return false;
    }

    return true;
}
  
  public int calcularPeriodos(int dias) {

   int periodos = dias / 30;

    if (dias % 30 != 0) {
        periodos++;
    }

    return periodos;
}
  
  public void calcularCosto(int cantidadDias) {

    int periodos = calcularPeriodos(cantidadDias);

    double costoEspacio = espacio.getPrecioMensual() * periodos;
    double costoServicios = 0;

    for (Servicio servicio : servicios) {
        costoServicios = costoServicios + servicio.getPrecio();
    }

    total = costoEspacio + costoServicios;

    subtotal = total / 1.13;

    impuestos = total - subtotal;
}
  public void activarContrato() {

    if (estado == EstadoContrato.PENDIENTE) {
        estado = EstadoContrato.ACTIVO;
    } else {
        throw new IllegalStateException("El contrato no se puede activar");
    }
}
  public void finalizarContrato() {

    if (estado == EstadoContrato.ACTIVO) {
        estado = EstadoContrato.FINALIZADO;
    } else {
        throw new IllegalStateException("El contrato no se puede finalizar");
    }
}
  public void cancelarContrato() {

    if (estado == EstadoContrato.PENDIENTE) {
        estado = EstadoContrato.CANCELADO;
    } else {
        throw new IllegalStateException("El contrato no se puede cancelar");
    }
}      
}
