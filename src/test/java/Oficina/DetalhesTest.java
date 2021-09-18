package Oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetalhesTest {

    @Test
    void deveRetornarStatus(){
        try{
            Detalhes detalhe = new Detalhes(1);
            detalhe.setStatus(null);
            fail();
        }
        catch (NullPointerException e){
        assertEquals("status é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroSemConserto(){
        Detalhes detalhe = new Detalhes(2);
        detalhe.getTipoDescricao();
        assertEquals("Carro não precisou de conserto", detalhe.getTipoDescricao());
    }

}