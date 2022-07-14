package com.springcoretraining.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Watch {
	private String brand;

	public Watch() {
		super();
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Watch: [" + this.brand + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Wearing watch...");
	}

	@PreDestroy
	public void end() {
		System.out.println("Removing watch...");
	}
}
