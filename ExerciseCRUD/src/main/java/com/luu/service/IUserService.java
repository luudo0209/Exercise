package com.luu.service;

import java.util.List;

import com.luu.entity.User;

public interface IUserService {

	List<User> getAllUsers();
	
	void addUser(User user);
	
	User editUser(User user);
	
	void deleteUser(Long id);
	
	User searchUserByEmail(String email);
	
	User searchUserByName(String name);
}
