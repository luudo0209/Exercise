package com.luu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luu.entity.User;
import com.luu.service.serviceImp.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@GetMapping(value = "/allUsers")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}
	
	@PostMapping(value = "/newUser")
	public void addUser(User user) {
		userService.addUser(user);
	}
	
	@PutMapping(value = "/user")
	public String editUser(@RequestBody User user) {
		userService.editUser(user);
		return "Success";
	}
	
	@DeleteMapping(value = "/user")
	public String deleteUser(@RequestBody Long id) {
		userService.deleteUser(id);	
		return "Success";
	}
	
	@PostMapping(value = "/userByEmail")
	public User getUserByEmail(@RequestBody String email) {
		return userService.searchUserByEmail(email);
	}
	
	@PostMapping(value = "/userByName")
	public User getUserByName(@RequestBody String name) {
		return userService.searchUserByName(name);
	}
}
