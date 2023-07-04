package com.example.bindings;

public class Product {
	
	public Integer productId;
	public String productName;
	public Double productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
public Product(Integer productId, String productName, double productPrice){
		
	productId=productId;
	productName=productName;
	productPrice=productPrice;
		
	}
public Product() {
	// TODO Auto-generated constructor stub
}

}
