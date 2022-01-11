package com.awanish.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.spring.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
