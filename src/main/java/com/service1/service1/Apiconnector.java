package com.service1.service1;

import UserDto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Slf4j
@Service
@RequiredArgsConstructor
public class Apiconnector {
    private final  WebClient webClient;
    private final ObjectMapper objectMapper;

    public UserDto getService1(UserDto userDto) throws JsonProcessingException {
        log.info("getService1: " + userDto);
        UserDto res = webClient.post().uri("http://localhost:8081/createUser")
                .bodyValue(userDto)
                .retrieve()
                .bodyToMono(UserDto.class)
                .block();
        log.info("getService1: " + objectMapper.writeValueAsString(res));
        return res;
    }



}
