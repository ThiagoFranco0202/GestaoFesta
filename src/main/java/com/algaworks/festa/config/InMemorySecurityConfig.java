package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder)
            throws Exception {
        builder
                .inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("USER")
                .and()
                .withUser("pumpkin").password("{noop}pumpkin").roles("USER")
                .and()
                .withUser("thiago").password("{noop}123").roles("USER");
    }
}
