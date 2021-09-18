package Oficina;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNome() {
        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius");
        assertEquals("Vinicius", cliente.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeNulo(){
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome cliente é obrigatório", e.getMessage());
        }
    }
}