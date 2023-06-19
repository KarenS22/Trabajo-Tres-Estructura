/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.trabajo.en.clase.tres;

import ec.edu.ups.trabajo.en.clase.tres.controlador.ControladorMain;
import ec.edu.ups.trabajo.en.clase.tres.modelo.Agenda;
import ec.edu.ups.trabajo.en.clase.tres.vista.Vista;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TrabajoEnClaseTres {


    public static void main(String[] args) {
        Vista vista = new Vista();
        ControladorMain con = new ControladorMain(vista);
        con.iniciar();
       /* Agenda<String> agenda = new Agenda<>();
         
       agenda.agregar ( "karen", "0333333");
        agenda.agregar ("kare", "01111");
        agenda.agregar ("kar", "022222");
        agenda.agregar ("ka", "04444");

        String e0 = agenda.getPersonaByIndice(0);
            System.out.println ("obtener persona 1:" +" "+ e0);

        String e1 = agenda.getPersonaByIndice(1);
            System.out.println ("obtener persona 2:" +" " + e1);

        String e2 = agenda.getPersonaByIndice(2);
                System.out.println ("obtener persona 3:" +" " + e2);

        String e3 = agenda.getPersonaByIndice(3);
            System.out.println ("obtener persona 4:" + " " + e3);


        agenda.eliminar ("karen");

        System.out.println ("------------");

            String ele = agenda.getPersonaByIndice(1);
            System.out.println ("obtener persona 2" +  ele); 
*/
    }
}
