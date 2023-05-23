package com.springboot.web.app.controllers;

import com.springboot.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model) {
        model.addAttribute("title", "Main Page");
        model.addAttribute("text", "Hello world using Model");
        return "index";
    }

    @RequestMapping("/perfil")
    public String infoUser(Model model) {
        User user = new User();
        user.setName("Juan");
        user.setLastname("Alimaña");
        user.setEmail("correo@email.com");
        model.addAttribute("usuario", user);
        model.addAttribute("title", "User Profile for ".concat(user.getName()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("title", "Lista de usuarios");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<User> obtenerUsuarios() {
        return Arrays.asList(
                new User("Pedro", "Sanchez", ""),
                new User("Juanito", "Alimaña", "juan@juan.juan"),
                new User("Johnatan", "Casallas", "boid@boid.com")
        );
    }
}
