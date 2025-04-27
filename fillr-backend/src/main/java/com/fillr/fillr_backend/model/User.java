package com.fillr.fillr_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;

import java.security.AuthProvider;
import java.time.Instant;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String passwordHash;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private Instant createdAt;
    private Instant updatedAt;

}
