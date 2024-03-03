package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/") //При переходе вызывается некая функцыя внизу
    public String Home(Model model) {
        model.addAttribute("Title", "Главаня страница");
        return "Home";
        // По шаблону home мы вызываем другой шаблон
    }
}