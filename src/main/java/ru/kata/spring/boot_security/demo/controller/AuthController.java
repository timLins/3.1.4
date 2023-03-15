package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/process_login")
public class AuthController {
    @GetMapping
    public String loginPage() {
        return "AUTH/process_login";
    }
}
