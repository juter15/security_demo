package com.example.security.security_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Slf4j
@Controller
public class LoginController {

    @PostMapping("/index")
    public String index() {
        return "/index";
    }

    @GetMapping("/franchiselogin")
    public String franchiselogin() {
        return "/franchiselogin";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
