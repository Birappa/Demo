package com.shophub2.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shophub2.bean.Product;

public class ProductDao implements IProductDao {

	private JdbcTemplate jdbcTemplate;
	String query;



	public ProductDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;

	}


	public Product get(long productId) {

		Object[] inputs=new Object[]{productId};
		query="select * from product where productid=?";
		Product product = jdbcTemplate.queryForObject(query,inputs, new ProductMapper());
		return product;
	}



	public List<Product> getAll(){  
		query="select * from product";
		List<Product> product=jdbcTemplate.query(query, new ProductMapper());
		return product!=null?product:null;
	}


	public long add(Product product) {
		Object[] inputs=new Object[]{product.getProductName(),product.getProductPrice()};
		query="insert into product(productid,productname,price) values( productId_seq.nextval,?,?)";  
		return jdbcTemplate.update(query,inputs); 
	}

	public int remove(int productId) {
		Object[] inputs=new Object[]{productId};
		query="delete from product where productid=?";    
		return jdbcTemplate.update(query,inputs);  
	}

	public int update(long productId, String productName,double productPrice) {
		Object[] inputs=new Object[]{productName,productPrice,productId};
		query="update product set productname=?,price=? where productid=?";  
		return jdbcTemplate.update(query,inputs);  
	}

	public boolean contains(long productId, String productName) {
		
		Object[] inputs=new Object[]{productName,productId};
		query="update product set productname=? where productid=?";  
		return jdbcTemplate.update(query,inputs)==1?true:false; 
	}

	@Override
	public String toString() {
		return "ProductDAO [jdbcTemplate=" + jdbcTemplate + "]";
	}


	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ProductDao jdbcModel=context.getBean(ProductDao.class);
		//System.out.println(jdbcModel.get(1));
		//System.out.println(jdbcModel.getAll());
		//System.out.println(jdbcModel.add(new Product("boat",800)));
		//System.out.println(jdbcModel.remove(23));
		//System.out.println(jdbcModel.update(6,"iphonex",50000));
		System.out.println(jdbcModel.contains(6,"iphonex"));
	}
}
