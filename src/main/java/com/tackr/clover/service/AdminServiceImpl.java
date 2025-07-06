package com.tackr.clover.service;

import com.tackr.clover.domain.Game;
import com.tackr.clover.domain.User;
import com.tackr.clover.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements UserService, AdminService {

    private final UserRepository userRepository;

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Game configureNewGame() {
        return null;
    }

    @Override
    public User createNewUser() {
        return null;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
