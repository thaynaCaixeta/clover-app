package com.tackr.clover.service;

import com.tackr.clover.domain.Admin;
import com.tackr.clover.domain.Game;
import org.springframework.stereotype.Service;

public interface AdminService {
    Game configureGame();
    Admin createAdmin();
}
