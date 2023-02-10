package com.example.ApiTokenGen.ApiTokenGen;

import com.google.gson.Gson;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
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
        Gson gson = new Gson();// convert java object int0 json represention
        HttpEntity<String> request=new HttpEntity<>(gson.toJson(loginRequest), headers);
        ResponseEntity<LoginResponse> s = restTemplate.postForEntity
                ("https://coreuat-zwqcqy3qmq-el.a.run.app/getlogintoken"
                        ,request,LoginResponse.class);
//        System.out.println(s.getBody());
        return s.getBody();
    }
    public final String url="https://coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile?id";
    public final String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpdHBsIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNjc2MDIwNTMyMDAzLCJleHAiOjE2NzYwMjIzMzJ9.QNoy-baA1DhIbNDq-bxw3-_-E5CDOkkgb8qUbWPzIZzecsd2U7djyCnKAC2kA3Cipy_qMa7AI5PQbTkG0eQUkw";
    public ResponseEntity<UserDetails> getJsonResponse() {
        HttpHeaders headers=new HttpHeaders();
        headers.set("Authorization",""+token);
        HttpEntity<UserDetails> entity=new HttpEntity<>(null,headers);
        return restTemplate.exchange(url, HttpMethod.GET,entity, UserDetails.class);
    }
}
