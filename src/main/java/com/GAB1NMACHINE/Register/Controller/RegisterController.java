package com.GAB1NMACHINE.Register.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController{
    @GetMapping("/authenticate")
    public String authenticate() {
        return "authenticate";
    }
}