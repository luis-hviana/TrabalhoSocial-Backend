package br.luis.empresa.empresa.controller;

import br.luis.empresa.empresa.datasource.model.PessoaEmpresa;
import br.luis.empresa.empresa.repository.PessoaEmpresaRepository;


import java.awt.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaEmpresaController {

    @Autowired
    private PessoaEmpresaRepository pessoaEmpresaRepository;

    @CrossOrigin
    @GetMapping(path = "/pessoaempresa")
    public List<PessoaEmpresa> buscar() { return pessoaEmpresaRepository.findAll(); }

    @CrossOrigin
    @GetMapping(path = "/pessoaempresa/{id}")
    public Optional<PessoaEmpresa> buscarID(@PathVariable(name = "id", required = true) long id) {
        return pessoaEmpresaRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping(path = "/pessoaempresa")
    public void criar(@RequestBody PessoaEmpresa pessoaEmpresa) { pessoaEmpresaRepository.save(pessoaEmpresa); }

    @CrossOrigin
    @DeleteMapping(path = "/pessoaempresa/delete/{id}")
    public void delete(@PathVariable(name = "id", required = true) long id) { pessoaEmpresaRepository.deleteById(id);}
}
