package com.demoMS.demoMS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/Hello")
    ResponseEntity<String> getMsg (){
        return new ResponseEntity<String>("Welcome to Microservices", HttpStatus.OK);
    }
}
