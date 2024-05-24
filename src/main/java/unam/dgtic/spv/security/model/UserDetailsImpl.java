package unam.dgtic.spv.security.model;

import unam.dgtic.spv.core.model.Usuario;
import unam.dgtic.spv.core.model.Rol;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
    private Integer id;
    private String name;
    private String email;
    private Collection<? extends GrantedAuthority> authorities;
    private Map<String, Object> attributes;
    private Usuario usuario;

    public UserDetailsImpl(Usuario usuario) {
        this.usuario = usuario;
    }

    public UserDetailsImpl(Integer id, String name, String email, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(Usuario user) {
        List<GrantedAuthority> authorities = user.getUseInfoRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getNombre())
        ).collect(Collectors.toList());
        return new UserDetailsImpl(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                authorities
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (null == usuario.getUseInfoRoles()) {
            return Collections.emptySet();
        }
        Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Rol role : usuario.getUseInfoRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getNombre()));
        }
        return grantedAuthorities;
    }

    /**
     * getUsername
     * @return username
     */
    @Override
    public String getUsername() {
        return usuario.getEmail();
    }

    /**
     * getPassword (OTP)
     * @return password
     */
    @Override
    public String getPassword() {
        return usuario.getPassword();
    }

    /**
     * getName
     * @return name
     */
    public String getName() {
        return usuario.getNombre();
    }

    /**
     * getEmail
     * @return email
     */
    public String getEmail() {
        return usuario.getEmail();
    }

    /**
     * isEnabled
     * @return if user is enabled
     */
    @Override
    public boolean isEnabled() {
        return usuario.getActivo() == true;
    }

    /**
     * isAccountNonLocked
     * @return if user is locked
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * isAccountNonExpired
     * @return if account is not expired
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * isCredentialsNonExpired
     * @return if credential is not expired
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}
