package com.service1.service1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
@RequiredArgsConstructor
public class Apiconnector {
    private final  WebClient webClient;

    public  String getService1() {
        return webClient.get().uri("http://localhost:8081/service2String")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
