package com.springcoretraining.constructorInjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certificateName;
	private List<String> wishList;

	public Person(String name, int personId, Certificate certificateName, List<String> wishList) {
		this.name = name;
		this.personId = personId;
		this.certificateName = certificateName;
		this.wishList = wishList;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + "\nCourse : " + this.certificateName + "\nWishList : "
				+ this.wishList;
	}
}
