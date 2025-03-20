package com.service1.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
public class Config {
    @Bean
    public WebClient getWebClient() {
        return WebClient.builder().baseUrl("http://localhost:8081/service2String").build();
    }
}
