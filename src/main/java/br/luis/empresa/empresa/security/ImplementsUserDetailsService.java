package br.luis.empresa.empresa.security;

import br.luis.empresa.empresa.datasource.model.Pessoa;
import br.luis.empresa.empresa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private PessoaRepository ps;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Pessoa pessoa = ps.findByLogin(login);

        if(pessoa == null) {
            throw new UsernameNotFoundException("Usuario não encontrador!");
        }
        return pessoa;
    }
}
