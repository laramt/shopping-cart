package com.project.shoppingcart.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.shoppingcart.PaymentOptions;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JsonIgnore
	private Client client;
	@OneToMany
	private List<Item> items;
	private double totalValue;
	private PaymentOptions paymentOptions;
	private boolean closed;
	
	public Cart() {
		super();
	}

	public Cart(Long id, Client client, List<Item> items, double totalValue, PaymentOptions paymentOptions,
			boolean closed) {
		super();
		this.id = id;
		this.client = client;
		this.items = items;
		this.totalValue = totalValue;
		this.paymentOptions = paymentOptions;
		this.closed = closed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public PaymentOptions getPaymentOptions() {
		return paymentOptions;
	}

	public void setPaymentOptions(PaymentOptions paymentOptions) {
		this.paymentOptions = paymentOptions;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
	
	
}
