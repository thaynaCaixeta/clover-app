package com.tackr.clover.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Admin extends User {

    private Boolean isAdmin;

    public Admin(UUID id, String username, String password, LocalDateTime createdAt, Boolean isActive) {
        super(id, username, password, createdAt, isActive);
    }

    public Boolean getAdmin() {
        return isAdmin;
    }
}
