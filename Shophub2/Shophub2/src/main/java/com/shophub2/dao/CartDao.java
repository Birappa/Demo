package com.shophub2.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.shophub2.bean.UserTransaction;
@Component
public class CartDao implements ICartDao{

	public UserTransaction get(long userId) {
		
		return null;
	}

	public Map<Long, UserTransaction> getAll(long userId) {
		
		return null;
	}

	public boolean add(UserTransaction userTransaction) {
		
		return false;
	}

	public boolean remove(long userId) {
		
		return false;
	}

	public boolean update(UserTransaction userTransaction) {
		
		return false;
	}

	public boolean contains(UserTransaction userTransaction) {
		
		return false;
	}

	
}
