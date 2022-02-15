/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext6.Entidades;

/**
 *
 * @author 54261
 */
public class Ahorcado {

    private String palabra;
    private String vectorPalabra[];
    private int cantJugadas;
    private int j;
    private int git;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Ahorcado(int j) {
        this.j = j;
    }
    private String muestra[];

    public Ahorcado(String palabra, String[] vectorPalabra, int cantJugadas, String[] muestra) {
        this.palabra = palabra;
        this.vectorPalabra = vectorPalabra;
        this.cantJugadas = cantJugadas;
        this.muestra = muestra;
    }

    public String[] getMuestra() {
        return muestra;
    }

    public void setMuestra(String[] muestra) {
        this.muestra = muestra;
    }

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String[] vectorPalabra, int cantJugadas) {
        this.palabra = palabra;
        this.vectorPalabra = vectorPalabra;
        this.cantJugadas = cantJugadas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public String getVectorPalabra(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
