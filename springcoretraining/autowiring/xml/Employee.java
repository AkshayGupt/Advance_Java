package com.springcoretraining.autowiring.xml;

public class Employee {
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public void setAddress(Address address) {
		System.out.println("Setting address from Employee class");
		this.address = address;
	}
}
