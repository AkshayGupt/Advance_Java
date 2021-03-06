package com.springcoretraining.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoretraining/constructorInjection/config-constructorInjection.xml");
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1);

		// Addition
		Addition add = (Addition) context.getBean("addition");
		add.doSum();
	}
}
