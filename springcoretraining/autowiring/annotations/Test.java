package com.springcoretraining.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoretraining/autowiring//annotations/config-autowiring.xml");
		Employee emp1 = (Employee) context.getBean("employee_1", Employee.class);
		System.out.println(emp1);
	}
}
