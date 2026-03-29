package com.example.email_job;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

@Configuration
@ImportRuntimeHints(EmailJobConfiguration.Hints.class)
class EmailJobConfiguration {

    EmailJobConfiguration() {
        IO.println("registering jobs on startup.");
    }


    static class Hints implements RuntimeHintsRegistrar {

        @Override
        public void registerHints(
                @NonNull RuntimeHints hints,
                @Nullable ClassLoader classLoader) {

            hints.reflection().registerType(DefaultHelloworldJob.class);
        }
    }

    @Bean
    DefaultHelloworldJob helloworldJob() {
        return new DefaultHelloworldJob();
    }
}
