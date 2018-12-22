package com.shophub2.dao;

import java.util.Map;

import com.shophub2.bean.UserTransaction;

public interface ICartDao {

	public UserTransaction get(long userId);
	public Map<Long, UserTransaction> getAll(long userId);
	public boolean add(UserTransaction userTransaction);
	public boolean remove(long userId);
	public boolean update(UserTransaction userTransaction);
	public boolean contains(UserTransaction userTransaction);
	
}
