package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyanting
 */
@RestController
public class DemoController {

    @GetMapping("{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name + " !!";
    }
}
