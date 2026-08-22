/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storageBox;

import contratos.Contrato;
import contratos.ListaContratos;
import java.util.Iterator;

/**
 *
 * @author marii
 */
public class StorageBox {
    private ListaContratos contratos;

    public StorageBox() {
        this.contratos = new ListaContratos();
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
}

