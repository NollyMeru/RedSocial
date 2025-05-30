package com.redsocial.redsocialpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginViewController {

    @GetMapping("/loginView")
    public String mostrarLogin() {
        // Return the loginView.html template when /loginView is accessed
        return "loginView";
    }
}
