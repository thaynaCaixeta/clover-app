package com.tackr.clover.repository;

import com.tackr.clover.domain.Admin;
import com.tackr.clover.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AdminRepository extends CrudRepository<Admin, UUID>  {}
