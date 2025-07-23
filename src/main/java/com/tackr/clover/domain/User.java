package com.tackr.clover.domain;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class User {

    @Column(nullable = false, unique = true)
    private UUID externalID;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private Boolean isActive;

    public User() {}

    public User(UUID externalID, LocalDateTime createdAt, Boolean isActive) {
        this.externalID = externalID;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public UUID getExternalID() {
        return externalID;
    }

    public void setExternalID(UUID externalID) {
        this.externalID = externalID;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
