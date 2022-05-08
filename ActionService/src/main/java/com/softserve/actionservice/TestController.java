package com.softserve.actionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String testEndpoint() {
        return "Hello world from Action Service";
    }
}
