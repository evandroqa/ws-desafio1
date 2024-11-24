package com.devsuperior.desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double vlrPedido = order.getBasic();
		double vlrFrete = 0.0;
		if (vlrPedido < 100) {
			vlrFrete = 20.0;
		} else if (vlrPedido < 200){
			vlrFrete = 12.0;
		}
		return vlrFrete;
	}

}
