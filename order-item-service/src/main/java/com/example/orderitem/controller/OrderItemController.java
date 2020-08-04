package com.example.orderitem.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderitem.entity.OrderItem;
import com.example.orderitem.service.OrderItemService;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
	private static final Logger LOG = Logger.getLogger(OrderItemController.class.getName());
	
	@Value("${spring.messages}")
	private String message;
	@Autowired
	OrderItemService service;
	
	@GetMapping("/orderitems")
	public ResponseEntity<List<OrderItem>> getAllOrderItems() {
		LOG.info("Inside getAllOrderItems");
		List<OrderItem> items = service.allOrderItems();
		if(null != items)
			return ResponseEntity.ok().body(items);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/orderitem")
	public ResponseEntity<OrderItem> createOrderItem(@Valid @RequestBody OrderItem orderitem) {
		OrderItem item = service.createOrderItem(orderitem);
		LOG.info("orderItem saved : "+ item.getProductCode());
		return ResponseEntity.ok().body(item);
	}
}
