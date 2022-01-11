package com.awanish.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.spring.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
