package com.example.emptystart;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(@RequestParam MultiValueMap<String,String> name) {
        System.out.println("Received request with parameters: " + name);
        return "Hello, World!";
    }
}
