package unam.dgtic.spv.security;

import unam.dgtic.spv.security.jwt.JWTAuthenticationFilter;
import unam.dgtic.spv.security.jwt.JWTTokenProvider;
import unam.dgtic.spv.security.logout.CustomLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.security.SecureRandom;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Autowired
    private UserDetailsService uds;
    @Autowired
    private JWTTokenProvider tokenProvider;
    @Autowired
    private CustomLogoutSuccessHandler customLogoutSuccessHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/bootstrap/**","/css/**", "/favicon.ico","/", "/index", "/token" ,"/error").permitAll()
                        .requestMatchers(
                                //ARTICULO
                                "/articulo/alta-articulo",
                                "/articulo/salvar-imagen",
                                "/articulo/salvar-imagen",
                                "/articulo/salvar-articulo",
                                "/articulo/modificar-articulo/{id}",
                                "/articulo/eliminar-articulo/{id}",
                                //CATEGORIA
                                "/categoria/alta-categoria",
                                "/categoria/salvar-categoria",
                                "/categoria/modificar-categoria/{id}",
                                "/categoria/eliminar-categoria/{id}",
                                //INGRESO
                                "/ingreso/alta-ingreso",
                                "/ingreso/agregar",
                                "/ingreso/quitar/{indice}",
                                "/ingreso/limpiar",
                                "/ingreso/terminar",
                                //PERSONA
                                "/persona/alta-persona",
                                "/persona/salvar-persona",
                                "/persona/modificar-persona/{id}",
                                "/persona/eliminar-persona/{id}",
                                //VENTA
                                "/venta/modificar-venta/{id}",
                                "/venta/eliminar-venta/{id}",
                                //ROL
                                "/rol/**",
                                //USUARIO
                                "/usuario/**"
                        ).hasAuthority("ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .defaultSuccessUrl("/index")
                        .successForwardUrl("/login_success_handler")
                        .permitAll())
                .logout(logout -> logout
                        .logoutUrl("/doLogout")
                        .logoutSuccessUrl("/index")
                        .deleteCookies("JSESSIONID") //NEW Cookies to clear
                        .logoutSuccessHandler(customLogoutSuccessHandler)
                        .clearAuthentication(true)
                        .invalidateHttpSession(true))
                .addFilterAfter(new JWTAuthenticationFilter(tokenProvider), UsernamePasswordAuthenticationFilter.class)
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        ;
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11, new SecureRandom());
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(uds);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        //your AuthenticationProvider must return UserDetails object
        return new ProviderManager(authenticationProvider());
    }
}
