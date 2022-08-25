package one.digitalinnovation.parking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration																		/*É uma annotation que indica que determinada classe possui 
																					  métodos que expõe novos beans*/
@EnableWebSecurity																	/*Acrescente a notação @EnableWebSecurity para ter as
																					  configurações do Spring Security.*/
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override																		/*Essa notação é uma forma de garantir que você está
    																				  sobrescrevendo um método e não criando um novo.*/
    //Configurar o login do usuario
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("Dio@123456"))
                .roles("USER")
                .and()
                .passwordEncoder(passwordEncoder());
    }

    @Override
    //Configura a autorização
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/swagger-ui.html").permitAll()
                .antMatchers("/swagger-resources/**").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/v2/api-docs/**").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/csrf").permitAll()
                .antMatchers("/*.js").permitAll()
                .antMatchers("/*.css").permitAll()
                .antMatchers("/*.ico").permitAll()
                .antMatchers("/*.png").permitAll()
                .anyRequest().authenticated()
                .and().httpBasic()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Bean																	/*Anotação utilizada em cima dos métodos de uma classe, geralmente
    																		marcada com @Configuration, indicando que o Spring deve invocar 
    																		aquele método e gerenciar o objeto retornado por ele. Ou seja,
    																	    agora este objeto pode ser injetado em qualquer ponto da sua aplicação.*/
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
