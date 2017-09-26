package com.leanstacks.ws.configuration.security;


import com.leanstacks.ws.security.AccountAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

/*@Configuration
@EnableWebSecurity
@Profile("docs")*/
public class SecurityConfiguration2 /*extends WebSecurityConfigurerAdapter*/ {

    /*@Autowired
    private HttpStatusReturningLogoutSuccessHandler logoutSuccessHandler;

    @Autowired
    private AuthenticationSuccessHandler restAuthenticationSuccessHandler;


    @Autowired
    private transient AccountAuthenticationProvider accountAuthenticationProvider;

    @Autowired
    public void configureGlobal(final AuthenticationManagerBuilder auth)
            throws Exception {

        auth.authenticationProvider(accountAuthenticationProvider);

    }

*//**
 * Supplies a PasswordEncoder instance to the Spring ApplicationContext. The
 * PasswordEncoder is used by the AuthenticationProvider to perform one-way
 * hash operations on passwords for credential comparison.
 *
 * @return A PasswordEncoder.
 *//*
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers( "/logout","/authenticate").permitAll()
                .antMatchers("/api/**").hasRole("USER")
                .antMatchers("/actuators/**").hasRole("SYSADMIN")
                .antMatchers("/adminpanel/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginProcessingUrl("/authenticate").permitAll()
                .successHandler(restAuthenticationSuccessHandler)
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(logoutSuccessHandler)
                .deleteCookies().permitAll();

    }*/
}
