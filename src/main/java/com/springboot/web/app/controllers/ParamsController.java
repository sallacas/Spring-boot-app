package com.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {
    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String paramString(@RequestParam(defaultValue = "Parametro no enviado") String text, Model model) {
        model.addAttribute("rs", text);
        return "params/ver";
    }
}
