package com.example.authenticationsvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

@Configuration
public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.inMemory().withClient("javainuse-client").secret("{noop}javainuse-secret")
                .authorizedGrantTypes("client_credentials").scopes("resource-server-read", "resource-server-write");
    }
}
