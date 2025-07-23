package com.tackr.clover.service;

import com.tackr.clover.domain.Player;

public interface PlayerService {
    Player createPlayer();
    Player updatePlayer(Player player);
    Player getPlayer(String externalID);
}
