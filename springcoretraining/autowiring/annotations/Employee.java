package com.springcoretraining.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	// type1:
	@Autowired
	// If multiple beans with same type are there, then we can add the reference of
	// the required bean inside Qualifier annotation
	//Syntax:@Qualifier("address2")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// type2: @Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee Constructor executed");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		System.out.println("Getting address from Employee class");
		return address;
	}

	// type3: @Autowired
	public void setAddress(Address address) {
		System.out.println("Setting address from Employee class");
		this.address = address;
	}
}
