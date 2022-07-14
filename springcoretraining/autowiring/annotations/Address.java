package com.springcoretraining.autowiring.annotations;

public class Address {
	private String city;
	private String street;

	public String getCity() {
		System.out.println("Getting city from Address class");
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting city from Address class");
		this.city = city;
	}

	public String getStreet() {
		System.out.println("Getting street from Address class");
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setting street from Address class");
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
}
