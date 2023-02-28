package com.example.ApiTokenGen.ApiTokenGen.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private WelcomeService welcomeService;
    @GetMapping("/welcome")
    public String welcome()
    {
       return welcomeService.retrieveWelcomeMessage();
    }


}
