package com.demo.example.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.model.User;
import com.demo.example.repository.UserRepository;
import com.demo.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
	
	@Override
	public Optional<User> getUserByName(String name) {
		return userRepository.findByName(name);
	}


	@Override
	public User addUser(User user) {
		return userRepository.save(user);		
	}

}
