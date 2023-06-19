/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.en.clase.tres.modelo;

/**
 *
 * @author ACER
 */
public class Agenda<T> {
    private Contacto<T> persona;

    public Agenda() {
    }

    public Agenda(Contacto<T> persona) {
        this.persona = persona;
    }
    
    
    public void agregar (T nombre, T elemento){
        Contacto<T> nuevo = new Contacto(nombre, elemento);
        if (persona == null){
            persona = nuevo;
        } else{
            Contacto<T> ultimoContacto = obtenerUltimo();
            ultimoContacto.setSiguiente(nuevo);
            
        }
    }
    
    public Contacto<T> obtenerUltimo(){
        Contacto<T> actual = persona;
        while (actual.getSiguiente() != null ){
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public String getPersonaByIndice (int indice){
        Contacto<T> actual = persona;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        
        return actual.getNombre() + "-" + actual.getTelefono();
    }
    
    public void eliminar(String nombre){
        if(persona == null){
            return;
        }
        if (persona.getNombre().equals(nombre)){
            persona = persona.getSiguiente();
            return;
        }
        Contacto<T> anterior = persona;
        Contacto<T> actual = persona.getSiguiente();
        while (actual != null && !actual.getNombre().equals(nombre)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null) {
            anterior.setSiguiente(actual.getSiguiente());
        }
        
    }

    @Override
    public String toString() {
        return "Agenda{" + "persona=" + persona + '}';
    }
    
}
