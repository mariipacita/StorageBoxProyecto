/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package StorageBox;

/**
 *
 * @author marii
 * @param <T>
 */
public interface KeyDynamicsList<T,K> extends DynamicsLists<T,K> {
    public T get(K id);
    public boolean remove(K item);
}
