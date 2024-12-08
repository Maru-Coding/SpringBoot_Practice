package com.example.SpringBoot_Practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
    public String show(Model model){
        model.addAttribute("name", "마루");
        return "test";
    }

}
