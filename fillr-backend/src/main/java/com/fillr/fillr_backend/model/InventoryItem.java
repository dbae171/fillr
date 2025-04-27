package com.fillr.fillr_backend.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class InventoryItem {
    @Id @GeneratedValue
    private Long id;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private InventoryStatus status;

    private Integer reorderThreshold;

    @ManyToOne
    private Unit unit;

    private Instant lastUpdated;

}