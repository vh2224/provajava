package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetalhesTest {

    @Test
    void deveRetornarStatus(){
        Detalhes detalhe = new Detalhes();
        detalhe.setStatus(1);
        assertEquals(1, detalhe.getStatus());
    }
}