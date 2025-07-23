package com.tackr.clover.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "admins")
public class Admin extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public Admin() {}

    public Admin(UUID externalID, LocalDateTime createdAt, Boolean isActive) {
        super(externalID, createdAt, isActive);
    }

    public UUID getId() {
        return id;
    }
}
