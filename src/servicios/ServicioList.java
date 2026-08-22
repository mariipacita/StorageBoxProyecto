/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ServicioList {
     private ArrayList<Servicio> listaServicios;
     private int codigoServicio;

    public ServicioList(ArrayList<Servicio> listaServicios, int codigoServicio) {
        this.listaServicios = listaServicios;
        this.codigoServicio = codigoServicio;
        
        
        
    }
    
    
    
    
    public boolean agregarServicios(String nombre, String descripcion, double precio){
        if(nombre.isEmpty() || descripcion.isEmpty()){
            return false;
        }
        if(precio <= 0){
            return false;
        }
        Servicio servicio =  new Servicio(codigoServicio, nombre, descripcion, precio);
        listaServicios.add(servicio);
        codigoServicio++;
        return true;
    }    
    
    
    public boolean eliminarServicio(int codigo){
        Servicio servicio = buscarServicio(codigo);
        if (servicio != null){
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }
    
    
        public Servicio buscarServicio(int codigo){
        for(Servicio servicio : listaServicios){
            if(servicio.getCodigo()== codigo){
                return servicio;
            }
        }
        return null;
    }
     
     
     
    
}
