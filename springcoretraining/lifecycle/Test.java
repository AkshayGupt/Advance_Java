package com.springcoretraining.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoretraining/lifecycle/config-lifecycle.xml");
		/**
		 * If we want the destroy method to run then we have to use the
		 * registerShutdownHook.
		 * 
		 * To get the registerShutdownHook, we need to use AbstractApplicationContext
		 * instead of ApplicationContext.
		 */
		context.registerShutdownHook();

		/* LIFECYCLE */

		// Type1: using init-method & destroy-method in config file.
		Dish samosaPrice = (Dish) context.getBean("samosa");
		System.out.println(samosaPrice);

		// Type2: Implementing the interfaces.
		Vehicle car = (Vehicle) context.getBean("car");
		System.out.println(car);

		// Type3: Using annotations @PostConstruct & @PreDestroy.We also need to enable
		// these annotations from the config-xml file.
		// Note: These are removed from latest java, so need to add an additional
		// dependency in pom file.
		Watch watch = (Watch) context.getBean("watch");
		System.out.println(watch);
	}
}
