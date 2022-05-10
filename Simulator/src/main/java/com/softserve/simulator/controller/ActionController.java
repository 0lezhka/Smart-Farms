package com.softserve.simulator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("action")
public class ActionController {
    @GetMapping(path = "/dispatch")
    @ResponseStatus(code = HttpStatus.OK)
    public void performAction() {
        System.err.println("hello world");
    }
}
