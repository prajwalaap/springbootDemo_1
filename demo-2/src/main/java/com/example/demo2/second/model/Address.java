package com.example.demo2.second.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@Column(name = "PIN")
	private Integer pin;
	private String street;
	

	public Address() {

	}

	public Address(Integer pin,String street) {
		this.street = street;
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
