package com.example.email_job;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class EmailJobConfiguration {

    EmailJobConfiguration() {
        IO.println("registering jobs on startup.");
    }

    @Bean
    HelloworldJob helloworldJob() {
        return new DefaultHelloworldJob();
    }
}
