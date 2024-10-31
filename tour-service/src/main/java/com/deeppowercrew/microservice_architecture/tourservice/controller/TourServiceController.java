package com.deeppowercrew.microservice_architecture.tourservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tour")

public class TourServiceController {


    @Value("${eureka.instance.instance-id}")
    private String eurekaInstanceClientID;


    @GetMapping("/name")
    public String name() {
        return "spring.application.name = " + eurekaInstanceClientID;
    }
}
