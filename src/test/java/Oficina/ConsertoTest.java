package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsertoTest {

    @Test
    void deveRetornarCarro(){
        Conserto conserto = new Conserto();
        Carro carro = new Carro();
        conserto.setCarro(carro);
        assertEquals(true, conserto.getCarro() instanceof Carro);

    }

}