package com.example.ApiTokenGen.ApiTokenGen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private final LoginService loginService;

    public LoginController(LoginService loginService) {

        this.loginService = loginService;
    }

    @PostMapping("/getlogintoken")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return loginService.getToken(loginRequest);
    }
    @GetMapping("/getlogintoken")
    public ResponseEntity<UserDetails> getJsonResponse()
    {
        return loginService.getJsonResponse();
    }




}
