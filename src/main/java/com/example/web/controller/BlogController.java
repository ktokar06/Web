package com.example.web.controller;

import com.example.web.models.Post;
import com.example.web.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/Blog") //При переходе вызывается некая функцыя внизу
    public String BLogMain(Model model) {
        model.addAttribute("Title", "Страница про BLog");
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "Blog";
        // По шаблону home мы вызываем другой шаблон
    }
    @GetMapping("/Blog/Add") //При переходе вызывается некая функцыя внизу
        public String BLogAdd(Model model) {
        return "Blog-add";
        // По шаблону home мы вызываем другой шаблон
    }
    @PostMapping("/Blog/Add")
    public String BlogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model){
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/Blog` v ";
    }
}
