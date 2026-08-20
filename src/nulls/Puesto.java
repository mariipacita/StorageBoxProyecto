/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package nulls;

/**
 *
 * @author sharys
 */
public enum Puesto {
    
    ADMINISTRADOR(950000),
    RECEPCIONISTA(700000),
    ENCARGADO_BODEGA(650000),
    MANTENIMIENTO(600000),
    OPERARIO_CARGA(575000);
    
    private double salario;
    
    Puesto(double salario){
    this.salario = salario;
}
    public double getSalario() {
        return salario;
    }
    
    
    
}
