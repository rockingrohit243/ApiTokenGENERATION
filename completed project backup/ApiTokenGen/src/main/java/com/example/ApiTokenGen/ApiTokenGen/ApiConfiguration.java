package com.example.ApiTokenGen.ApiTokenGen;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfiguration {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder,AuthorizationInterceptor authorizationInterceptor){
        return restTemplateBuilder
                .additionalInterceptors(authorizationInterceptor)
                .build();
    }
}
