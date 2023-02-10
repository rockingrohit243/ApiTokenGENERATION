package com.example.ApiTokenGen.ApiTokenGen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;


import java.io.IOException;
public class AuthorizationInterceptor implements ClientHttpRequestInterceptor {

     private final LoginService loginService;
    public AuthorizationInterceptor(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override

    public ClientHttpResponse intercept
            (HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        LoginResponse loginResponse=
                loginService.getToken(new LoginRequest("username","password"));
        request.getHeaders().add("Authorization",""+loginResponse.getToken());
        return execution.execute(request, body);
    }
}
