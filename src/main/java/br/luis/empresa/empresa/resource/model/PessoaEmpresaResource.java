package br.luis.empresa.empresa.resource.model;

import br.luis.empresa.empresa.datasource.model.Empresa;
import br.luis.empresa.empresa.datasource.model.Pessoa;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaEmpresaResource {

    @JsonProperty("")
    private Empresa empresa;
    private Pessoa pessoa;

    public PessoaEmpresaResource(Empresa empresa, Pessoa pessoa) {
        this.empresa = empresa;
        this.pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
