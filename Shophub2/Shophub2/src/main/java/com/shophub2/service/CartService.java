package com.shophub2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shophub2.bean.UserTransaction;
import com.shophub2.dao.CartDao;

public class CartService 
{ 
<<<<<<< HEAD
	List<UserTransaction> list =new ArrayList<UserTransaction>();
=======
	@Autowired
	CartDao cartdao;
	
	List<UserTransaction> list =new ArrayList<>();
>>>>>>> e6f0d14d56243873446b0ef388e65bc0a9b61bc6
	public List<UserTransaction> buyNow(UserTransaction ut)
	{
          list.add(ut);		
          System.out.println(list);
		return list;
	}
	
	public boolean addProductToCart(UserTransaction trans){
		return cartdao.add(trans);
	}
}
