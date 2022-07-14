package com.springcoretraining.lifecycle;

public class Dish {
	private double price;

	public Dish() {
		super();
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price= " + price);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [price=" + price + "]";
	}

	public void init() {
		System.out.println("Initializing...");
	}

	public void destroy() {
		System.out.println("Closing connections...");
	}
}
