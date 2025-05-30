package com.redsocial.redsocialpro.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
@Table(name = "users")
public class User implements UserDetails {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @Column(unique = true)
        private String email;

        private String password;

        private String role;


        @Column(name = "registry_date")
        private LocalDateTime registryDate;

    public User(Long id, String name, String email, String password, LocalDateTime registryDate, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.registryDate = registryDate;
        this.role = role;
    }

    public User() {

    }

    // Métodos de UserDetails
        @Override
        public String getUsername() {
            return email; // usamos email como identificador único
        }

        @Override
        public boolean isAccountNonExpired() { return true; }

        @Override
        public boolean isAccountNonLocked() { return true; }

        @Override
        public boolean isCredentialsNonExpired() { return true; }

        @Override
        public boolean isEnabled() { return true; }

        @Override
        public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
            return java.util.Collections.emptyList(); // sin roles por ahora
        }

}
