/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clientes.cliente;
import Clientes.clientesList;
import contratos.Contrato;
/**
 *
 * @author marii
 */
public class ControladorContrato {
    private Contrato contrato;
   private clientesList listaClientes;
   
   public ControladorContrato(Contrato contrato) {
        this.contrato = contrato;
        this.listaClientes= listaClientes;
    }
   
   public void activarContrato() {
    contrato.activarContrato();
}

   public void finalizarContrato() {
    contrato.finalizarContrato();
}

   public void cancelarContrato() {
    contrato.cancelarContrato();
}
   public void calcularCosto(int cantidadDias) {
    contrato.calcularCosto(cantidadDias);
}
   public cliente buscarCliente(String cedula) {
    return listaClientes.ObtenrKey(cedula);
}
   
}

