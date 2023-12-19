package com.demonit.MyApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        return message;
    }
}
