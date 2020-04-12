package br.luis.empresa.empresa.security;

import br.luis.empresa.empresa.datasource.model.Empresa;
import br.luis.empresa.empresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsEmpresaDetaisService implements UserDetailsService {

    @Autowired
    private EmpresaRepository er;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Empresa empresa = er.findByLogin(login);

        if (empresa == null) {
            throw new UsernameNotFoundException("Empresa não encontrada");
        }
        return empresa;
    }
}
