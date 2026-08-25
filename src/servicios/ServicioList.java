/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PC
 */

public class ServicioList {

    private ArrayList<Servicio> listaServicios;

    public ServicioList() {
        this.listaServicios = new ArrayList<>();
    }

    public boolean add(Servicio servicio) {
        return listaServicios.add(servicio);
    }

    public Servicio get(int codigo) {

        for (Servicio servicio : listaServicios) {

            if (servicio.getCodigo() == codigo) {
                return servicio;
            }
        }

        return null;
    }

    public boolean remove(int codigo) {

        Servicio servicio = get(codigo);

        if (servicio == null) {
            return false;
        }

        return listaServicios.remove(servicio);
    }

    public boolean actualizarServicio(int codigo,
            String descripcion,
            double precio) {

        Servicio servicio = get(codigo);

        if (servicio == null) {
            return false;
        }

        if (descripcion.isEmpty() || precio <= 0) {
            return false;
        }

        servicio.setDescripcion(descripcion);
        servicio.setPrecio(precio);

        return true;
    }

    public Iterator<Servicio> getAll() {

        if (listaServicios.isEmpty()) {
            return null;
        }

        return listaServicios.iterator();
    }

    public int size() {
        return listaServicios.size();
    }

    public boolean isEmpty() {
        return listaServicios.isEmpty();
    }
}
