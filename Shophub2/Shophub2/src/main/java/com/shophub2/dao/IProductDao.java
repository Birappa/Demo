package com.shophub2.dao;

import java.util.List;

import com.shophub2.bean.Product;


public interface IProductDao {
	public Product get(long productId);

	public List<Product> getAll();

	public long add(Product product);

	public int remove(int productId);

	public int update(long productId, String productName,double price);

	public boolean contains(long productId, String productName);
}
