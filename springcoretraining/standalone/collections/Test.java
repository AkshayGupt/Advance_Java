package com.springcoretraining.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoretraining/standalone/collections/config-standalone.xml");

		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1.getFriends());
		System.out.println("List type: " + person1.getFriends().getClass().getName());
		System.out.println(person1.getFee());
		System.out.println("Map type: " + person1.getFee().getClass().getName());
		System.out.println(person1.getProps());
		System.out.println("Props type: " + person1.getProps().getClass().getName());
	}
}
