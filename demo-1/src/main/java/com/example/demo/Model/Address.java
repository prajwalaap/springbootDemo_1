package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	private String street;
	@Id
	@Column(name="PIN")
	private Integer pin;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;

	public Address() {
		
	}
	public Address(String street, Integer pin) {
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
