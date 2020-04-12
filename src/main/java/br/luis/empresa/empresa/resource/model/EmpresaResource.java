package br.luis.empresa.empresa.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmpresaResource {

    @JsonProperty("")
    private long id;
    private String nome;
    private String login;
    private String senha;
    private String cidade;
    private String estado;
    private String projeto;

    public EmpresaResource(long id, String login, String senha, String nome, String cidade, String estado, String projeto) {
        this.id = id;
        this.login = login;
        this.senha = senha;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

