package com.example.orderitem.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderitem.entity.OrderItem;
import com.example.orderitem.repository.OrderItemRepository;

@Service
public class OrderItemService {
	private static final Logger LOG = Logger.getLogger(OrderItemService.class.getName());
	@Autowired
	OrderItemRepository repo;

	public List<OrderItem> allOrderItems(){
		LOG.info("OrderItemService || Getting all items");
		return repo.findAll();
	}
	public OrderItem createOrderItem(OrderItem item) {
		LOG.info("OrderService || Saving OrderItem : "+ item);
		return repo.save(item);
	}
	
}
