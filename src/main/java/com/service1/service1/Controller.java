package com.service1.service1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service service;
    @GetMapping("/service1")
    public String service1() {
        return service.service1();
    }
    @GetMapping("/service1string")
    public String service2Sstring() {
        return "hello .this is service1";
    }
}
