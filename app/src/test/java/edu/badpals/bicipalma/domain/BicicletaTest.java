package edu.badpals.bicipalma.domain;

import org.junit.Before;

public class BicicletaTest {
    Bicicleta bici;
    
    @Before
    public void setup() {
        this.bici = new Bicicleta(999);
    }

}
