package com.app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		Address a =(Address)ac.getBean("addrObj");
		System.out.println(a);
	}
}
