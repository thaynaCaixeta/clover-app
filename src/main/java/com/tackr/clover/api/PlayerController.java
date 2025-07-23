package com.tackr.clover.api;

import com.tackr.clover.domain.Player;
import com.tackr.clover.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public ResponseEntity<Player> registerPlayer() {
        Player player = playerService.createPlayer();
        if (player == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(201).body(player);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);
        if (updatedPlayer == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(updatedPlayer);
    }

    @GetMapping("/{externalID}")
    public ResponseEntity<Player> getPlayer(@PathVariable String externalID) {
        Player player = playerService.getPlayer(externalID);
        if (player == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(player);
    }
}
