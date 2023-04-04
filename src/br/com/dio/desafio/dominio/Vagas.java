package br.com.dio.desafio.dominio;

public class Vagas {

    private String empresa;
    private String cargo;
    private String modalidade;
    private String localidade;
    private String descricao;

    public Vagas() {
    }

    public Vagas(String empresa, String cargo, String modalidade, String localidade, String descricao) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.modalidade = modalidade;
        this.localidade = localidade;
        this.descricao = descricao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Vagas{" +
                "empresa='" + empresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", localidade='" + localidade + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
