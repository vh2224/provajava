package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OficinaTest {

    @Test
    void deveRetornarNome(){
       Oficina oficina = new Oficina();
       oficina.setNome("Oficina Caranguejos");
       assertEquals("Oficina Caranguejos", oficina.getNome());
    }

    @Test
    void deveRetornarLocalidadeOficina(){
        Oficina oficina = new Oficina();
        oficina.setLogradouro("Rua Manoel Pinto Ribeiro");
        assertEquals("Rua Manoel Pinto Ribeiro", oficina.getLogradouro());
    }

}