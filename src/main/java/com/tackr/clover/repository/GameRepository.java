package com.tackr.clover.repository;

import com.tackr.clover.domain.Game;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import java.util.UUID;

public interface GameRepository extends ListPagingAndSortingRepository<Game, UUID> {}
