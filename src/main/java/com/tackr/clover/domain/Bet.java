package com.tackr.clover.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "bets")
public class Bet {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    private Round round;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private Player player;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    public Bet() {}

    public Bet(Round round, Player player, String paymentStatus) {
        this.round = round;
        this.player = player;
        this.paymentStatus = paymentStatus;
    }

    public UUID getId() {
        return id;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
