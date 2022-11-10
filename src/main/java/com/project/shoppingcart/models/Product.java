package com.project.shoppingcart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private double unitValue;
	private boolean available;
	@ManyToOne
	@JsonIgnore
	private Restaurant restaurant;
	
	
	public Product() {
		super();
	}


	public Product(Long id, String name, double unitValue, boolean available, Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.unitValue = unitValue;
		this.available = available;
		this.restaurant = restaurant;
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


	public double getUnitValue() {
		return unitValue;
	}


	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	

}
