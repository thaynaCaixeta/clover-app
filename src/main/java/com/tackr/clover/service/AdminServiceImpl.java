package com.tackr.clover.service;

import com.tackr.clover.domain.Admin;
import com.tackr.clover.domain.Game;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public Game configureGame() {
        // TODO: Implement new game configuration
        return null;
    }

    @Override
    public Admin createAdmin() {
        // TODO: Implement new admin creation
        Admin admin = new Admin();
        admin.setActive(true);
        return admin;
    }
}
