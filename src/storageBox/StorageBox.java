/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;

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

    public StorageBox() {
        this.contratos = new ListaContratos();
         this.empleados = new ListaEmpleados();
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

    public boolean actualizarEmpleado(String identificacion,
            String nombre,
            String telefono,
            PuestoEmpleado puesto) {

        return empleados.actualizarEmpleado (identificacion, nombre, telefono, puesto);
    }

    public Iterator<Empleado> getEmpleados() {
        return empleados.getAll();
    }
}

