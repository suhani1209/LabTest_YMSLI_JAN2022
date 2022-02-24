package com.traineeMgmt.model.service;

import java.util.Optional;

import com.traineeMgmt.model.persistance.user.User;
import com.traineeMgmt.model.persistance.user.UserDao;
import com.traineeMgmt.model.persistance.user.UserDaoImpl;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	
	public Optional<User> getUser(String username, String password) {
		return userDao.getUser(username, password);
	}

}