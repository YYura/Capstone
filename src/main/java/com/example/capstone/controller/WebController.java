package com.example.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
