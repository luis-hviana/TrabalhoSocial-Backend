package br.luis.empresa.empresa.repository;

import br.luis.empresa.empresa.datasource.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByLogin(String login);
}

