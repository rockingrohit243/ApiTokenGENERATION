package com.springtest.in.springtestfile.config;

import com.springtest.in.springtestfile.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter
{   @Autowired
    private CustomUserDetailsService customUserDetailsService;
    protected void configure(HttpSecurity http) throws Exception // which url to permit,disable csrf
   {
        http.csrf().disable()
                .cors().disable().authorizeRequests().
                antMatchers("/token").permitAll().
                anyRequest().authenticated().and().sessionManagement().
                sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{ //which authentication is to be used
        auth.userDetailsService(customUserDetailsService); //for calling the method by using this load authentication details

    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return NoOpPasswordEncoder.getInstance();
    }

















}
