package com.shophub2.dao;

import java.util.List;

import com.shophub2.bean.User;



public interface IUserDao {
	public User get(String email);

	public List<User> getAll();

	public User add(User user);

	public boolean remove(long userId);

	public boolean update(User user);

	public boolean contains(long userId, String userName);
	

}
