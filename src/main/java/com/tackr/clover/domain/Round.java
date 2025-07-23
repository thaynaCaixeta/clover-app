package com.tackr.clover.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "rounds")
public class Round {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    private Game game;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "round_sorted_numbers", joinColumns = @JoinColumn(name = "round_id"))
    @Column(name = "number", nullable = false)
    private List<Integer> sortedNumbers;

    public Round(){}

    public Round(Game game, List<Integer> sortedNumbers) {
        this.game = game;
        this.sortedNumbers = sortedNumbers;
    }

    public UUID getId() {
        return id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Integer> getSortedNumbers() {
        return sortedNumbers;
    }

    public void setSortedNumbers(List<Integer> sortedNumbers) {
        this.sortedNumbers = sortedNumbers;
    }
}
