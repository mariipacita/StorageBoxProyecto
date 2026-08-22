/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contratos;
import storageBox.KeyDynamicsList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author marii
 */
public class ListaContratos implements KeyDynamicsList<Contrato, Integer> {

    private HashMap<Integer, Contrato> contratos;

    public ListaContratos() {
        this.contratos = new HashMap<>();
    }

    public Contrato get(Integer numeroContrato) {

        if (!contratos.containsKey(numeroContrato)) {
            return null;
        }
        return contratos.get(numeroContrato);
    }

    public boolean remove(Integer numeroContrato) {
        return contratos.remove(numeroContrato) != null;
    }

    public boolean add(Contrato item) {
        if (contratos.containsKey(item.getNumeroContrato())) {
            return false;
        }

        return contratos.put(item.getNumeroContrato(), item) == null;
    }

    public Iterator getAll() {

        if (contratos.isEmpty()) {
            return null;
        }
        return contratos.values().iterator();
    }

    public int size() {
        return contratos.size();
    }

    public boolean isEmpty() {
        return contratos.isEmpty();
    }

}
