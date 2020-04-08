package br.luis.empresa.empresa.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaResource {

    @JsonProperty("")
    private long id;
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String trabalho;
    private String cidade;
    private String estado;

    public PessoaResource(long id, String nome, String login, String senha, String email, String trabalho, String cidade, String estado) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.trabalho = trabalho;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
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
}
