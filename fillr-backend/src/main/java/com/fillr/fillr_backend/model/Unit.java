package com.fillr.fillr_backend.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
public class Unit {
    @Id
    @GeneratedValue
    private Long id;

    private String unitName;
    private String address;

    @ManyToOne
    private User host;

    @ManyToMany
    private List<User> cleaners;

    private Instant createdAt;
}
