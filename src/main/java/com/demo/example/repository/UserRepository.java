package com.demo.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	public User save(User user);
	public Optional<User> findByName(String name);
}
