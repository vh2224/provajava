package Oficina;

public class Conserto {

    private Mecanico mecanico;
    private Carro carro;
    private Oficina oficina;
    private Detalhes detalhes;
    private String data;

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Detalhes getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Detalhes detalhes) {
        this.detalhes = detalhes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
