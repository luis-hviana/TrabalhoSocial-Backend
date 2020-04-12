package br.luis.empresa.empresa.repository;

import br.luis.empresa.empresa.datasource.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Empresa findByLogin(String login);
}
