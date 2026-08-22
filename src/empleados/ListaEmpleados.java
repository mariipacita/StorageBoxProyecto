/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.HashMap;
import java.util.Iterator;
import storageBox.KeyDynamicsList;

/**
 *
 * @author marii
 */
public class ListaEmpleados implements KeyDynamicsList<Empleado, String> {
    private HashMap<String, Empleado> empleados;

    public ListaEmpleados() {
        this.empleados = new HashMap<>();
    }

    public Empleado get(String identificacion) {

        if (!empleados.containsKey(identificacion)) {
            return null;
        }

        return empleados.get(identificacion);
    }

    public boolean remove(String identificacion) {
        return empleados.remove(identificacion) != null;
    }

    
    public boolean add(Empleado empleado) {

        if (empleados.containsKey(empleado.getIdentificacion())) {
            return false;
        }

        return empleados.put(
                empleado.getIdentificacion(),
                empleado
        ) == null;
    }

    public boolean actualizarEmpleado(String identificacion, String nombre, String telefono, PuestoEmpleado puesto) {

        Empleado empleado = get(identificacion);

        if (empleado == null) {
            return false;
        }

        empleado.actualizarEmpleado(nombre, telefono, puesto);

        return true;
    }

    public Iterator<Empleado> getAll() {

        if (empleados.isEmpty()) {
            return null;
        }

        return empleados.values().iterator();
    }

    public int size() {
        return empleados.size();
    }

    public boolean isEmpty() {
        return empleados.isEmpty();
    }
}
