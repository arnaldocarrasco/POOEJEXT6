/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext6.Servicio;

import java.util.Arrays;
import java.util.Scanner;
import pooejext6.Entidades.Ahorcado;

/**
 *
 * @author 54261
 */
public class Servicio {

    public Ahorcado crearJuego(Ahorcado ahorcado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        ahorcado.setPalabra(leer.next());
        System.out.println("Ingrese a cantidad de jugadas");
        ahorcado.setJ(leer.nextInt());
        ahorcado.setCantJugadas(ahorcado.getJ());

        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println(ahorcado.getPalabra().length());
    }

    public void llenarMatriz(Ahorcado ahorcado) {
        String vector[] = new String[ahorcado.getPalabra().length()];
        for (int i = 0; i < ahorcado.getPalabra().length(); i++) {
            vector[i] = ahorcado.getPalabra().substring(i, i + 1);
        }
        ahorcado.setVectorPalabra(vector);
    }

    public void Juego(Ahorcado ahorcado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un letra");
        String letra = leer.next();
        ahorcado.setCantJugadas(ahorcado.getJ() - 1);
        int contpal = 0;
        String vector[] = new String[ahorcado.getVectorPalabra().length];
        String vector2[] = new String[ahorcado.getVectorPalabra().length];
        for (int i = 0; i < ahorcado.getVectorPalabra().length; i++) {
            vector[i] = ahorcado.getPalabra().substring(i, i + 1);
            if (letra.equals(vector[i])) {
                contpal++;
                vector2[i] = letra;
                ahorcado.setMuestra(vector2);
            }
        }

        System.out.println("La letra se encontro " + contpal + " veces.");

    }

    public void encontradas(Ahorcado ahorcado) {
        System.out.println(Arrays.toString(ahorcado.getMuestra()));
    }
    
    public void modGitHub(Ahorcado ahorcado) {
        
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Quedan " + ahorcado.getCantJugadas() + " intentos.");
    }

}
