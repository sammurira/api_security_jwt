package com.muriras.security.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHelloI(){
        return  ResponseEntity.ok("Hello from secured end point");
    }
}
