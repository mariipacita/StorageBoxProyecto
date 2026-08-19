/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.ArrayList;

/**
 *
 * @author sharys
 */
public class ControlEmpleado {
    private ArrayList<Empleado> listaEmpleados;
    
    public ControlEmpleado() {
        listaEmpleados = new ArrayList<>();
    }
    
    public boolean agregarEmpleado(String identificacion, String nombre, String telefono, String puesto){
        if(identificacion.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || puesto.isBlank()){
            return false;
        }
        if (buscarEmpleado(identificacion) !=null){
            return false;
        }
        Empleado empleado = new Empleado(identificacion, nombre, telefono, puesto);
        listaEmpleados.add(empleado);
        return true;
    }
    
    public Empleado buscarEmpleado(String identificacion){
        for(Empleado empleado : listaEmpleados){
           if(empleado.getIdentificacion().equals(identificacion)){
               return empleado;
           }
        }
        return null;
    }
    
    public boolean actualizarEmpleado(String identificacion, String nombre, String telefono, String puesto){
        Empleado empleado = buscarEmpleado(identificacion);
        if(empleado !=null){
            if(nombre.isEmpty() || telefono.isEmpty() || puesto.isEmpty()) {
                return false;
            }
            empleado.setNombre(nombre);
            empleado.setTelefono(telefono);
            empleado.setPuesto(puesto);
            return true;
            }
        return false;

    }
    
    public boolean eliminarEmpleado(String identificacion){
        Empleado empleado = buscarEmpleado(identificacion);
        if (empleado != null){
            listaEmpleados.remove(empleado);
            return true;
        }
        return false;
    }
    public ArrayList<Empleado> getListaEmpleados(){
        return listaEmpleados;
    }
}
