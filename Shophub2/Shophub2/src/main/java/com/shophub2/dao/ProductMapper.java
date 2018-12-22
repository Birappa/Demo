package com.shophub2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shophub2.bean.Product;



public class ProductMapper implements RowMapper<Product>{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getLong("productid"));
		product.setProductName(rs.getString("productname"));
		product.setProductPrice(rs.getDouble("price"));
		  
	      return product;
	   }
}
