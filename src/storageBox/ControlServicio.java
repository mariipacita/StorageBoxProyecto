/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;

import java.util.ArrayList;
import servicios.ServicioList;
import servicios.Servicio;

/**
 *
 * @author sharys
 */
public class ControlServicio {
    private Servicio servico;
    private ServicioList listaServicios;

    public ControlServicio(Servicio servico, ServicioList listaServicios) {
        this.servico = servico;
        this.listaServicios = listaServicios;
    }
    
    
    
   
    

    
    public boolean actualizarServicio(int codigo, String descripcion, double precio){
        Servicio servicio = listaServicios.buscarServicio(codigo);
        if(servicio != null){
            if(descripcion.isEmpty() || precio <= 0){
                return false;
            }
            
            servicio.setDescripcion(descripcion);
            servicio.setPrecio(precio);
            return true;
        }
        return false;
    }
   
    
}
