package com.springboot.di.app.controllers;

import com.springboot.di.app.models.service.IService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final IService service;

    public IndexController(IService service) {
        this.service = service;
    }

    @GetMapping({"index/","/",""})
    public String index(Model model){
        model.addAttribute("response",service.operation());
        return "index";
    }

}