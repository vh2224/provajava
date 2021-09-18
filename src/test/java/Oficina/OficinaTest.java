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
    void deveRetornarExcecaoNomeNulo() {
        try {
            Oficina oficina = new Oficina();
            oficina.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome oficina é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarLocalidadeOficina(){
        Oficina oficina = new Oficina();
        oficina.setLogradouro("Rua Manoel Pinto Ribeiro");
        assertEquals("Rua Manoel Pinto Ribeiro", oficina.getLogradouro());
    }

    @Test
    void deveRetornarExcecaoLocalidadeOficinaNula(){
        try {
            Oficina oficina = new Oficina();
            oficina.setLogradouro(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Logradouro é obrigatório", e.getMessage());
        }

    }

}