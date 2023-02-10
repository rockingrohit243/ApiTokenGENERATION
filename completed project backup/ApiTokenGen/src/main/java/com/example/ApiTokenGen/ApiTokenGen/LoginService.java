package com.example.ApiTokenGen.ApiTokenGen;

import com.google.gson.Gson;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {
    @Autowired
    private final RestTemplate restTemplate;
    public LoginService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LoginResponse getToken(LoginRequest loginRequest){
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Gson gson = new Gson();
        HttpEntity<String> request=new HttpEntity<>(gson.toJson(loginRequest), headers);
        ResponseEntity<LoginResponse> s = restTemplate.postForEntity("https://coreuat-zwqcqy3qmq-el.a.run.app/getlogintoken",request,LoginResponse.class);
//        System.out.println(s.getBody());
        return s.getBody();
    }
}
