/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import servicios.Servicio;

/**
 *
 * @author sharys
 */
public class ControlServicio {
    private ArrayList<Servicio> listaServicios;
    private int codigoServicio;
    
    public ControlServicio(){
        listaServicios = new ArrayList<>();
        codigoServicio = 1;
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
    
    public Servicio buscarServicio(int codigo){
        for(Servicio servicio : listaServicios){
            if(servicio.getCodigo()== codigo){
                return servicio;
            }
        }
        return null;
    }
    
    public boolean actualizarServicio(int codigo, String descripcion, double precio){
        Servicio servicio = buscarServicio(codigo);
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
    
    public boolean eliminarServicio(int codigo){
        Servicio servicio = buscarServicio(codigo);
        if (servicio != null){
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }
    
    public ArrayList<Servicio> getListaServicios(){
        return listaServicios;
    }
    
}
