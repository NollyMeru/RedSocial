package com.redsocial.redsocialpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home() {
        return "redirect:/loginView";
    }

    @GetMapping("/busqueda")
    public String busqueda() {
        return "busqueda";
    }
}