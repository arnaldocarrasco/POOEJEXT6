/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext6;

import java.util.Scanner;
import pooejext6.Entidades.Ahorcado;
import pooejext6.Servicio.Servicio;

/**
 *
 * @author 54261
 */
public class POOEJEXT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio sa = new Servicio();
        Ahorcado a1 = new Ahorcado();
        System.out.println("                           EL AHORCADO\n"+
                           ""+
                           "                   Pulse ENTER para comenzar");                     
                System.out.print("" + leer.next());
        sa.crearJuego(a1);
        sa.llenarMatriz(a1);

        String opcion;
        do {

            System.out.println("                       EL AHORCADO");
            System.out.println("-------------------------------------------------------");
            System.out.println("                       A) ADIVINAR");
            System.out.println("-------------------------------------------------------");
            System.out.println("B) LONGITUD DE LA PALABRA   | | C) LETRAS ENCONTRADAS");
            System.out.println("D) INTENTOS RESTANTES       | | E) SALIR");
            System.out.println("--------------");
            System.out.println("                      ELIJA UNA OPCION");
            opcion = leer.next().toUpperCase();

            switch (opcion) {
               
                case "A":
                    sa.Juego(a1);
                    break;
                case "B":
                    sa.longitud(a1);
                    break;
                case "C":
                    sa.encontradas(a1);
                    break;
                case "D":
                    sa.intentos(a1);
                    break;
                case "E":
                    opcion = "E";
                    System.out.println("Muchas gracias.");
            }

            System.out.println("--------------");
            System.out.println("--------------");
        } while (!"E".equals(opcion));
    }

}
