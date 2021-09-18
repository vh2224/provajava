package Oficina;

public class Oficina {

    private Integer idOficina;
    private String nome;
    private String logradouro;

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null){
            throw new NullPointerException("Logradouro é obrigatório");
        }
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new NullPointerException("Nome oficina é obrigatório");
        }
        this.nome = nome;
    }
}
