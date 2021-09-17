package Oficina;

public class Conserto {

    private Mecanico idMecanico;
    private Carro idCarro;
    private Oficina idOficina;
    private Detalhes idDetalhes;

    public Mecanico getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(Mecanico idMecanico) {
        this.idMecanico = idMecanico;
    }

    public Carro getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Carro idCarro) {
        this.idCarro = idCarro;
    }

    public Oficina getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Oficina idOficina) {
        this.idOficina = idOficina;
    }

    public Detalhes getIdDetalhes() {
        return idDetalhes;
    }

    public void setIdDetalhes(Detalhes idDetalhes) {
        this.idDetalhes = idDetalhes;
    }
}
