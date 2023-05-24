package com.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class SourceVariablesController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Send values");
        return "variables/index";
    }

    @GetMapping("/string/{text}")
    public String variables(@PathVariable String text, Model model) {
        model.addAttribute("title", "Ver variables");
        model.addAttribute("rs", "El texto resultado es " + text);
        return "variables/ver";
    }

    @GetMapping("/string/{text}/{number}")
    public String variables(@PathVariable String text, @PathVariable String number, Model model) {
        model.addAttribute("title", "Ver variables");
        model.addAttribute("rs", "El texto resultado es " + text
                + " y el numero es " + number);
        return "variables/ver";
    }
}
