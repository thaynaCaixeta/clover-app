package com.tackr.clover.repository;

import com.tackr.clover.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID>  {}
