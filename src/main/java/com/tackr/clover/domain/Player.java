package com.tackr.clover.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "players")
public class Player extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String fullName;

    @Embedded
    private Address address;

    public Player() {
        super();
    }

    public Player(UUID externalID, LocalDateTime createdAt, Boolean isActive, String name, String fullName,
                  String line1, String line2, String city, String state, String zip, String country) {
        super(externalID, createdAt, isActive);
        this.name = name;
        this.fullName = fullName;
        this.address = new Address(line1, line2, city, state, zip, country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
