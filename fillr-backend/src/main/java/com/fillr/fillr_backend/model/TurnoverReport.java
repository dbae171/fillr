package com.fillr.fillr_backend.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class TurnoverReport {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Unit unit;

    @Lob
    private String inventoryFlags; // JSON serialized low/out items

    private Instant SubmittedAt;

}
