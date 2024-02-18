package com.demoproject.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "user") String name,
                             @RequestParam(value = "city", required = false) String city) {
        return "Hello " + name + (city == null ? "" : " from " + city) + "!";
    }

}
