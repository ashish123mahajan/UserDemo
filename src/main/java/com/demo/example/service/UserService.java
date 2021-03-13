package com.demo.example.service;

import java.util.Optional;

import com.demo.example.model.User;

public interface UserService {

	public Optional<User> getUser(Long id);
	public User addUser(User user);
	public Optional<User> getUserByName(String name);
}
