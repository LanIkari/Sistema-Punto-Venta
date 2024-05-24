package unam.dgtic.spv.security.service;

import unam.dgtic.spv.core.model.Usuario;
import unam.dgtic.spv.core.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Security - UserDetailsServiceImpl.loadUserByUsername {}", username);
        Usuario usuario = Optional.ofNullable(usuarioRepository.findByEmail(username))
                .orElseThrow(() -> new UsernameNotFoundException("User not found in database"));
        String userName = usuario.getEmail();
        String password = usuario.getPassword();
        List<GrantedAuthority> authorities = usuario.getUseInfoRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
        return new User(userName, password, authorities);
    }
}
