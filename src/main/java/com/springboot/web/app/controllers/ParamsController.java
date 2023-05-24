package com.springboot.web.app.controllers;

import jakarta.servlet.http.HttpServletRequest;
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

    @GetMapping("/mix-params")
    public String paramString(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
        model.addAttribute("rs", "El saludo es" + saludo + "y el numero es" + numero);
        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    public String paramString(HttpServletRequest request, Model model) {
        model.addAttribute("rs", request.getParameter("saludo") +
                "y el numero es" + request.getParameter("numero"));
        return "params/ver";
    }
}
