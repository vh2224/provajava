package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNomeCompleto() {
        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius");
        cliente.setSobrenome("Almeida");

        assertEquals("Vinicius Almeida", cliente.getFullName());
    }

}