package com.service1.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
public class Config {
    @Bean
    public WebClient getWebClient(WebClient.Builder builder) {
        return builder.baseUrl("http://localhost:8081/createUser").build();

    }
}
