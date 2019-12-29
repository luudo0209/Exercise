package com.luu.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luu.entity.User;
import com.luu.repository.UserRepository;
import com.luu.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired 
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();	
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);	
	}

	@Override
	public User editUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User searchUserByEmail(String email) {
		List<User> userList = userRepository.findAll();
		for (User user : userList) {
			if(email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User searchUserByName(String name) {
		List<User> userList = userRepository.findAll();
		for (User user : userList) {
			if(name.equals(user.getUserName())) {
				return user;
			}
		}
		return null;
	}
}
