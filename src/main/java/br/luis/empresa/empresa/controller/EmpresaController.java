package br.luis.empresa.empresa.controller;

import br.luis.empresa.empresa.datasource.model.Empresa;
import br.luis.empresa.empresa.repository.EmpresaRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @CrossOrigin
    @GetMapping(path = "/empresa")
    public List<Empresa> buscarEmpresa() { return empresaRepository.findAll(); }

    @CrossOrigin
    @GetMapping(path = "/empresa/{id}")
    public Optional<Empresa> buscarEmpresaID(@PathVariable(name = "id", required = true) long id) {
        return empresaRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping(path = "/empresa/create")
    public void criarEmpresa(@Valid @RequestBody Empresa empresa) { empresaRepository.save(empresa); }

    @CrossOrigin
    @DeleteMapping(path = "/empresa/{id}")
    public void deleteEmpresa(@PathVariable(name = "id", required = true) long id) { empresaRepository.deleteById(id); }

    @CrossOrigin
    @PutMapping(path = "/empresa")
    public Empresa uptadeEmpresa(@Valid @RequestBody Empresa empresa) { return empresaRepository.save(empresa); }
}

