/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.en.clase.tres.controlador;

import ec.edu.ups.trabajo.en.clase.tres.modelo.Agenda;
import ec.edu.ups.trabajo.en.clase.tres.modelo.Contacto;
import ec.edu.ups.trabajo.en.clase.tres.vista.Vista;

/**
 *
 * @author ACE
 */
public class ControladorMain<T> {
    private Vista vista;
    private Agenda<T> agenda;
   // private Contacto<T> contacto;
       
    public ControladorMain(Vista vista) {
        this.vista = vista;
        this.agenda = new Agenda<>();
    }

    public ControladorMain() {
    }
    
    
    public void iniciar() {
        int opcionPrincipal = -1;

        while (opcionPrincipal != 0) {
            opcionPrincipal = vista.mostrarMenuPrincipal();

            // Instancia de [dato] segun la opcion escogida
            switch (opcionPrincipal) {
                case 1:
                    T nombre = (T)vista.pedirNombre();
                    T telefono =(T) vista.pedirTelefono();
                   // contacto = new Contacto<T>(nombre, telefono);
                    agenda.agregar(nombre, telefono);
                    
                    break;
                case 2:
                    int indice = vista.pedirIndice();
                    String elemento = agenda.getPersonaByIndice(indice);
                    vista.mostrarMensaje(elemento);
                    break;
                case 3: 
                    String nombreB = vista.pedirNombre();
                    String personaB = agenda.buscarPorNombre(nombreB);
                    vista.mostrarMensaje(personaB);
                    break;
                case 4:
                    String nombreE = vista.pedirNombre();
                    agenda.eliminar(nombreE);
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }
        }
    }


    
    
}
