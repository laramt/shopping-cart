package com.project.shoppingcart.dtos;

public class RestaurantDto {

	private String name;
	private String email;
	private String phoneNumber;
	// private List<Product> products;
	private String adress;
	
	public RestaurantDto() {
		super();
	}

	public RestaurantDto(String name, String email, String phoneNumber, String adress) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}
