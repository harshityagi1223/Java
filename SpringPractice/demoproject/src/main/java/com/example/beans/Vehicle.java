package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	private String name;
	
	public Vehicle(){
		name = "joey";
	}
	@Autowired
	public Vehicle(Animal animal) {
		name ="pooja";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
