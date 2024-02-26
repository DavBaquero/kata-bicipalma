package edu.badpals.bicipalma.domain;

public class Bicicleta implements Movil{
    private int id = 0;

    public Bicicleta(int id){
        this.id = id;
    }

    
    public int getId() {
        return this.id;
    }

    public String toString(){
        return Integer.toString(this.id);
    }
}
