package com.demo.example.controller;

import com.demo.example.model.User;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		Optional<User> user= userService.getUser(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}		
	}
	
	@GetMapping("/user/name/{name}")
	public User getUser(@PathVariable String name) {
		Optional<User> user= userService.getUserByName(name);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}		
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
