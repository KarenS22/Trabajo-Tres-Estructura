/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.en.clase.tres.modelo;

/**
 *
 * @author ACER
 */
public class Contacto<T>{
    private T nombre;
    private T telefono;
    private Contacto<T> siguiente;

    public Contacto(T nombre, T telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.siguiente = null;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }

    public Contacto<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Contacto<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
