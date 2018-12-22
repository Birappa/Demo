package com.shophub2.controllers;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shophub2.bean.UserTransaction;
import com.shophub2.service.CartService;

public class TestService 
{
	public static void main(String[] args) {
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		 CartService service = (CartService) context.getBean("cartservice");
			service.buyNow(new UserTransaction(1, 1, "Headphone", 1, 1000, 1000));
			service.buyNow(new UserTransaction(2, 1, "Earphone", 1, 10000, 1000));	
			service.addProductToCart(new UserTransaction(3, 3, "Mobile", 3, 3000, 9000));
			
	}

}
