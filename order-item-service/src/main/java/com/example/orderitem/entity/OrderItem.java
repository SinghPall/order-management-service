package com.example.orderitem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "OrderItem")
@Table
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "productcode")
	private Long productCode;
	private String name;
	private Long quantity;
	public Long getProductCode() {
		return productCode;
	}
	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItem [productCode=" + productCode + ", name=" + name + ", quantity=" + quantity + "]";
	}
}