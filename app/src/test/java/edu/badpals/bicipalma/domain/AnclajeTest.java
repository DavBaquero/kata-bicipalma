package edu.badpals.bicipalma.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnclajeTest {
    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }
    
}
