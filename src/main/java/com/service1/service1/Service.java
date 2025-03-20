package com.service1.service1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class  Service {
    private final Apiconnector apiconnector;

    public String service1() {
        String service1String=apiconnector.getService1();
        return service1String;
    }
}
