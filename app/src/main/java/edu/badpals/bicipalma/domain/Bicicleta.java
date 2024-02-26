package edu.badpals.bicipalma.domain;

public class Bicicleta {
    private int id = 0;

    public Bicicleta(int id){
        this.id = id;
    }

    
    public int getId() {
        return this.id;
    }

    public String toString(){
        String cadena =Integer.toString(id);
        return cadena;
    }
}
