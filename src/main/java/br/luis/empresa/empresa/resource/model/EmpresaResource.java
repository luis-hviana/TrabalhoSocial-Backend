package br.luis.empresa.empresa.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmpresaResource {

    @JsonProperty("")
    private long id;
    private String nome;
    private String cidade;
    private String estado;
    private String projeto;

    public EmpresaResource(long id, String nome, String cidade, String estado, String projeto) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.projeto = projeto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}

