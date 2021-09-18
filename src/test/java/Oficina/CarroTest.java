package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarTipoDoCarro(){
        Carro carro = new Carro ();
        carro.setTipoCarro("EcoSport");
        assertEquals("EcoSport", carro.getTipoCarro());
    }

}