package com.example.ApiTokenGen.ApiTokenGen.welcome;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WelcomeService {
    @Value("${welcome.message}")
    private String welcomeMessage;



    public String retrieveWelcomeMessage() {
        return welcomeMessage;

    }
}
