package com.centralbank.app.service;

import com.centralbank.app.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
