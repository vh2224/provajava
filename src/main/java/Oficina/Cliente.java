package Oficina;

public class Cliente {

    private Integer idCliente;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;


    public Integer getId() {
        return idCliente;
    }

    public void setId(Integer id) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFullName() {
        return this.nome + " " + this.sobrenome;
    }

}
