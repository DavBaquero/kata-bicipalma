package edu.badpals.bicipalma.domain;

public class Anclajes {
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private Anclaje[] crearAnclajes(){
        for (int i = 0;i < anclajes.length;i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion , Movil bici) {

    }
}
