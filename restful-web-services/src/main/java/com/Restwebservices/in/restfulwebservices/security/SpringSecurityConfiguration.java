//
//package com.Restwebservices.in.restfulwebservices.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//@EnableWebSecurity
//public class SpringSecurityConfiguration   extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //setting our own configuation on the auth object
//        auth.inMemoryAuthentication().
//                withUser("rohit")
//                .password("rohit1").
//                roles("user");
//
//
//    }
////    @Bean
////    public PasswordEncoder passwordEncoder()
////    {
////        return NoOpPasswordEncoder.getInstance();
////   }
//}
//
