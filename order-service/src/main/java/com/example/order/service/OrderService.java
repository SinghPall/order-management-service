package com.example.order.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;

@Service
public class OrderService {
	private static final Logger LOG = Logger.getLogger(OrderService.class.getName());
	@Autowired
	OrderRepository repo;

	public List<Order> allOrderItems(){
		LOG.info("OrderService || Getting all items");
		return repo.findAll();
	}
	public Order createOrderItem(Order item) {
		LOG.info("OrderService || Saving OrderItem : "+ item);
		return repo.save(item);
	}
	
}
