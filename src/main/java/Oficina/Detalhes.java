package Oficina;

public class Detalhes {

    private Integer idDetalhes;
    private Integer status;
    private String descricao;

    public Detalhes(Integer status) {
        this.status = status;
    }

    public Integer getIdDetalhes() {
        return idDetalhes;
    }

    public void setIdDetalhes(Integer idDetalhes) {
        this.idDetalhes = idDetalhes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        if (status == null) {
            throw new NullPointerException("status é obrigatório");
        }
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getTipoDescricao() {
        if(this.descricao == null){
            return "Carro não precisou de conserto";
        }
        return this.descricao = descricao;
    }

}
