package com.deeppowercrew.microservice_architecture.ticketservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String eurekaInstanceClientID;

    @Value("${temporaryVariable}")
    private Integer temporaryVariable;

    @GetMapping("/test")

      public String test(){
        return "spring.application.name = " + eurekaInstanceClientID + " temporaryVariable = " + temporaryVariable ;
    }
}
