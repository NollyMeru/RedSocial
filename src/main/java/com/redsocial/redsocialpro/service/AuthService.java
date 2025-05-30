package com.redsocial.redsocialpro.service;

import com.redsocial.redsocialpro.entity.User;
import com.redsocial.redsocialpro.repo.Userepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private Userepo usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User iniciarSesion(String email, String password) {
        return usuarioRepository.findByEmail(email)
                .filter(usuario -> passwordEncoder.matches(password, usuario.getPassword()))
                .orElse(null);
    }
}