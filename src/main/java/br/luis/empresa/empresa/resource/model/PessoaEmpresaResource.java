package br.luis.empresa.empresa.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaEmpresaResource {

    @JsonProperty("")
    private long pessoa_id;
    private long empresa_id;

    public PessoaEmpresaResource(long pessoa_id, long empresa_id) {
        this.pessoa_id = pessoa_id;
        this.empresa_id = empresa_id;
    }

    public long getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(long pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(long empresa_id) {
        this.empresa_id = empresa_id;
    }
}
