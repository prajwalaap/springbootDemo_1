package com.example.demo2.first.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	private Integer id;
	private String name;
	
	
	public User() {
		
	}
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
