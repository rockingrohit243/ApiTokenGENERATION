package com.example.ApiTokenGen.ApiTokenGen.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBhealthService implements HealthIndicator {
    public static final String DB_SERVICE="DATABASE SERVICE";
    public boolean isHealthGood()
    {
        return true;

    }
    @Override
    public Health health() {
        if (isHealthGood()) {
            return Health.up().withDetail(DB_SERVICE, "DATABASE SERVICE IS RUNNING").build();
        }
        return Health.down().withDetail(DB_SERVICE,"database service is running down").build();
    }
}
