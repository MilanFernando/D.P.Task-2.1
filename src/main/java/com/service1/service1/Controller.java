package com.service1.service1;

import UserDto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service service;
    @PostMapping("/service1")
    public UserDto service1(@RequestBody UserDto userDto) throws JsonProcessingException {
        log.info("namefrom dto: " + userDto);
        return service.getvalue(userDto);
    }
    @GetMapping("/service1string")
    public String service2Sstring() {
        return "hello .this is service1";
    }
}
