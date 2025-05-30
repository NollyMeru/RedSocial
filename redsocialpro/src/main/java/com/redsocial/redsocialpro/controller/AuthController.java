package com.redsocial.redsocialpro.controller;

import com.redsocial.redsocialpro.entity.User;
import com.redsocial.redsocialpro.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        User usuario = authService.iniciarSesion(email, password);
        if (usuario != null) {
            return "Bienvenido, " + usuario.getName();
        } else {
            return "Credenciales incorrectas";
        }
    }
}

