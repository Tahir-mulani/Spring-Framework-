package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("firstspringDemo.xml");
		Object obj = context.getBean("emp");
		Employee employee = (Employee)obj; 
		employee.show();
	}

}
