package com.tackr.clover.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Integer numberOfRounds;

    private final LocalDateTime createAt;

    private final LocalDateTime closesAt;

    private GameStatus status;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User createdBy;

    public Game(UUID id, Integer numberOfRounds, LocalDateTime createAt, LocalDateTime closesAt, GameStatus status, User createdBy) {
        this.id = id;
        this.numberOfRounds = numberOfRounds;
        this.createAt = createAt;
        this.closesAt = closesAt;
        this.status = status;
        this.createdBy = createdBy;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(Integer numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getClosesAt() {
        return closesAt;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Admin createdBy) {
        this.createdBy = createdBy;
    }
}
