package Oficina;

public class Carro {

    private Integer idCarro;
    private String tipoCarro;
    private String numPlaca;
    private Cliente cliente;

    public Integer getId() {
        return idCarro;
    }

    public void setId(Integer id) {
        this.idCarro = id;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
