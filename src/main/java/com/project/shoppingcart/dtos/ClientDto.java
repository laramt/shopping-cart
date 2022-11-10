package com.project.shoppingcart.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientDto {

	private String name;
	private String email;
	private String phoneNumber;
	@JsonFormat(pattern = "dd/mm/YYYY")
	private Date birthDate;
	private String adress;


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


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
