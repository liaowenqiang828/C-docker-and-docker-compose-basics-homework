package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class AliceController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/hello")
    public String greet() {
        String bobUrl = "http://localhost:8081/hello";
        ResponseEntity<String> response = restTemplate.exchange(bobUrl, HttpMethod.GET, null, String.class);
        return response.getBody();
    }
}