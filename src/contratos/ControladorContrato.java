/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contratos;
import contratos.Contrato;
/**
 *
 * @author marii
 */
public class ControladorContrato {
   private Contrato contrato;
   
   public ControladorContrato(Contrato contrato) {
        this.contrato = contrato;
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
   
}
