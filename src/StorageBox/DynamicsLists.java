/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package StorageBox;

import java.util.Iterator;

/**
 *
 * @author marii
 * @param <T>
 */
public interface DynamicsLists<T,K> {
    public boolean add(T item);
    public Iterator getAll();
    public int size();
    public boolean isEmpty();
}
