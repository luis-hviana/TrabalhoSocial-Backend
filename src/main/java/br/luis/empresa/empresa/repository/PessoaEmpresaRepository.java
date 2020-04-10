package br.luis.empresa.empresa.repository;

import br.luis.empresa.empresa.datasource.model.PessoaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaEmpresaRepository extends JpaRepository<PessoaEmpresa, Long> {
}
