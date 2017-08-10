package com.zipkin.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    private static final String SERVICE_URL = "http://localhost:8081/hi/{name}";

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return restTemplate().getForEntity(SERVICE_URL, String.class, name).getBody();
    }
}
