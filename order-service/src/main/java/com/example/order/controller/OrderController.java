package com.example.order.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	private static final Logger LOG = Logger.getLogger(OrderController.class.getName());
	
	@Value("${spring.messages}")
	private String message;
	@Autowired
	OrderService service;
	
}
