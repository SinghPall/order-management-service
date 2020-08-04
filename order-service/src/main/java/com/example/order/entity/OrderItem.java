package com.example.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "OrderItem")
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "productcode")
	private Long productCode;
	@NotNull
	private String name;
	@NotNull
	private Long quantity;
	@ManyToOne
    @JoinColumn(name="order_id", nullable=false)
	private Order order;
	
	public OrderItem() {}
	
	public OrderItem(Long productCode, @NotNull String name, @NotNull Long quantity, Order order) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.quantity = quantity;
		this.order = order;
	}

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