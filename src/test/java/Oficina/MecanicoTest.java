package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MecanicoTest {

    @Test
    void deveRetornarNomeMecanico(){
        Mecanico mecanico = new Mecanico();
        mecanico.setNome("Manoel");
        assertEquals("Manoel", mecanico.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeMecanicoNulo(){
        try {
            Mecanico mecanico = new Mecanico();
            mecanico.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome do mecanico é obrigatório", e.getMessage());
        }
    }
}