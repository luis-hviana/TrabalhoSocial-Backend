package br.luis.empresa.empresa.controller;

import br.luis.empresa.empresa.datasource.model.Pessoa;
import br.luis.empresa.empresa.repository.PessoaRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(path = "/pessoa")
    public List<Pessoa> buscarPessoa() { return pessoaRepository.findAll(); }

    @GetMapping(path = "/pessoa/{id}")
    public Optional<Pessoa> buscarPessoaID(@PathVariable(name = "id", required = true) long id) {
        return pessoaRepository.findById(id);
    }

    @PostMapping(path = "/pessoa/create")
    public void criarPessoa(@RequestBody Pessoa pessoa) { pessoaRepository.save(pessoa); }

    @DeleteMapping(path = "/pessoa/{id}")
    public void deletePessoaID(@PathVariable(name = "id", required = true) long id) {
        pessoaRepository.deleteById(id);
    }
}