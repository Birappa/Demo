package com.shophub2.bean;

public class UserTransaction 
{
	private long userId;
	private long productId;
	private String productName;
	private int quantity;
	private double price;
	private double total;
	public UserTransaction(long userId, long productId, String productName,
			int quantity, double price, double total) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "UserTransaction [userId=" + userId + ", productId=" + productId
				+ ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", total=" + total + "]";
	}
	

}
