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

    @Column(updatable = false)
    private Integer numberOfRounds;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime closesAt;

    private GameStatus status;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Admin createdBy;

    public Game() {}

    public Game(Integer numberOfRounds, LocalDateTime createAt, LocalDateTime closesAt, GameStatus status, Admin createdBy) {
        this.numberOfRounds = numberOfRounds;
        this.createAt = createAt;
        this.closesAt = closesAt;
        this.status = status;
        this.createdBy = createdBy;
    }

    public UUID getId() {
        return id;
    }

    public Integer getNumberOfRounds() {
        return numberOfRounds;
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

    public Admin getCreatedBy() {
        return createdBy;
    }
}
