package com.tackr.clover.repository;

import com.tackr.clover.domain.Admin;
import com.tackr.clover.domain.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PlayerRepository extends CrudRepository<Player, UUID> {}

