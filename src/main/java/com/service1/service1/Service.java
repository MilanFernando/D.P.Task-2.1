package com.service1.service1;

import UserDto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class  Service {
    private final Apiconnector apiconnector;

    public UserDto getvalue(UserDto userDto) throws JsonProcessingException {
        log.info("getvalue: " + userDto);
         UserDto service1String=apiconnector.getService1(userDto);
        return service1String;
    }
}
