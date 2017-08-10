package com.zipkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name) {
        return "Service says Hi to " + name;
    }
}
