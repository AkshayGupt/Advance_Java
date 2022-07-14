package com.springcoretraining.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoretraining/autowiring/xml/config-autowiring.xml");
		Employee emp1 = (Employee) context.getBean("employee_1");
		System.out.println(emp1);
	}
}
