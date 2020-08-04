package com.example.order.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	private LocalDate date;
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items;
	private String address;
	private Long total;
	
	public Order() {}
	
	public Order(Long id, @NotNull String name, @NotNull LocalDate date, List<OrderItem> items, String address,
			Long total) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.items = items;
		this.address = address;
		this.total = total;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", date=" + date + ", items=" + items+", address="+ address +", total=" + total + "]";
	}	 
}