package com.springboot.di.app.controllers;

import com.springboot.di.app.models.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private Ticket ticket;

    @GetMapping("/see")
    public String see(Model model){
        model.addAttribute("title","Example on ticket of dependencies injection");
        model.addAttribute("ticket",ticket);
        return "ticket/see";
    }
}
