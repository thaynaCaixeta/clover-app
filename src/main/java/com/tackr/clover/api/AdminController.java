package com.tackr.clover.api;

import com.tackr.clover.domain.Admin;
import com.tackr.clover.domain.Game;
import com.tackr.clover.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public ResponseEntity<Admin> registerAdmin() {
        Admin admin = adminService.createAdmin();
        if (admin == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(admin);
    }

    @PostMapping("/game")
    public ResponseEntity<Game> configureGame() {
        Game game = adminService.configureGame();
        if (game == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(game);
    }
}
