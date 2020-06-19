package com.lsrspring01.lsrspring01.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 * 
 * @author Daniel Padua
 */
@RestController
@RequestMapping("api/example")
public class ExampleController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello World!");
    }
}