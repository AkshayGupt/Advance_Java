package com.springcoretraining.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vehicle implements InitializingBean, DisposableBean {
	private String vehicle;

	public Vehicle() {
		super();
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Vehicle: [" + this.vehicle + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// INIT METHOD
		System.out.println("Initializing vehicle...\nStart vehicle: " + this.vehicle);
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Vehicle stopped & Parking brakes applied...");
	}
}
