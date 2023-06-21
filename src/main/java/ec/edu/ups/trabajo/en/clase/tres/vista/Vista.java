/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.en.clase.tres.vista;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Vista {

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. agregar");
        System.out.println("2. buscar");
        System.out.println("3.buscar por nombre");
        System.out.println("4. eliminar");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
//        scanner.nextLine();
        return opcion;
    }

    public String pedirNombre() {
        System.out.println("Ingrese el nombre: ");
        return scanner.next();
    }
     public String pedirTelefono() {
        System.out.print("Ingrese el telefono: ");
        return scanner.next();
    }
     
          public int pedirIndice() {
        System.out.print("Ingrese el indice a buscar: ");
        return scanner.nextInt();
    }

    /// Muestra un mensaje como nivel 1
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /// Muestra un mensaje como nivel 2
    public void mostrarMensaje(String mensaje, int nivel) {
        StringBuilder tabs = new StringBuilder(); // Crear un StringBuilder para almacenar las tabulaciones

        for (int i = 0; i < nivel; i++) {
            tabs.append("\t"); // Agregar una tabulación al StringBuilder en cada iteración
        }
        System.out.println(tabs.toString() + mensaje); // Imprimir las tabulaciones seguidas del mensaje
    }
}
