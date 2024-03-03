package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about") //При переходе вызывается некая функцыя внизу
    public String about(Model model) {
        model.addAttribute("Title", "Страница про нас");
        return "About";
        // По шаблону home мы вызываем другой шаблон
    }
}
