package com.redsocial.redsocialpro.service;

import com.redsocial.redsocialpro.entity.User;
import com.redsocial.redsocialpro.repo.Userepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private Userepo usuarioRepository;

    public User iniciarSesion(String email, String password) {
        return usuarioRepository.findByEmail(email)
                .filter(usuario -> usuario.getPassword().equals(password))
                .orElse(null);
    }
}
