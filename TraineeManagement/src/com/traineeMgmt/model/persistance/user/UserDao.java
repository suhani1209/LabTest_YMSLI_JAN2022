package com.traineeMgmt.model.persistance.user;

import java.util.Optional;

public interface UserDao {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);
}
