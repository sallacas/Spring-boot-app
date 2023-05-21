package com.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index","/","","/home"})
    public String index(Model model){
        model.addAttribute("title","Main Page");
        model.addAttribute("text","Hello world using Model");
        return "index";
    }
}
