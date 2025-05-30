package com.redsocial.redsocialpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ViewController {

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // busca login.html en /templates
    }
}

