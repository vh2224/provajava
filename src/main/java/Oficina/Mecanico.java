package Oficina;

public class Mecanico {

    private Integer idMecanico;
    private String nome;
    private String cpf;
    private String especialidade;
    private String endereco;

    public Integer getId() {
        return idMecanico;
    }

    public void setId(Integer id) {
        this.idMecanico = idMecanico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
