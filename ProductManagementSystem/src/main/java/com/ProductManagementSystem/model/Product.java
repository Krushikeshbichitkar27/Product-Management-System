package com.ProductManagementSystem.model;
/*
 * program : Product management system
 * code by: krushikesh
 * date :26-10-2022
 */

//declaring class
public class Product {
	// declaring instance variable
	private int pid;
	private String productName;
	private double price;
	private int quantity;

	// constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor
	public Product(int pid, String productName, double price, int quantity) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	// getter setter method
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// to string method
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}

}
