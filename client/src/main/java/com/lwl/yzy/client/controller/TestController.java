package com.lwl.yzy.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "test")
public class TestController {
    @GetMapping(value = "add/{str}")
    public String add(@PathVariable(value = "str") String str) {
        return str + "123";
    }
}
