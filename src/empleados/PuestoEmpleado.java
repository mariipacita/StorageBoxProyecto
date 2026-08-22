/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package empleados;

/**
 *
 * @author marii
 */
public enum PuestoEmpleado {
    ADMINISTRADOR(950000),
    RECEPCIONISTA(700000),
    ENCARGADO_BODEGA(650000),
    MANTENIMIENTO(600000),
    OPERARIO_CARGA(575000);

    private double salario;

    PuestoEmpleado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
