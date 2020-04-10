package br.luis.empresa.empresa.datasource.model;

import javax.persistence.*;

@Entity
public class PessoaEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name= "pessoa_id")
    private Pessoa pessoa;

    @OneToMany
    @JoinColumn(name= "empresa_id")
    private Empresa empresa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
