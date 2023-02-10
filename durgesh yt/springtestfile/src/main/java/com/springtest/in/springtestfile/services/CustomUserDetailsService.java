package com.springtest.in.springtestfile.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class CustomUserDetailsService implements UserDetailsService {
    private String username="rohit";
    private String password="rohit";

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if(userName.equals(username))
        {
            return new User("rohit","rohit",new ArrayList<>());
        }
        else
        {
            throw new UsernameNotFoundException("USER NAME NOT FOUND");
        }
    }
}
