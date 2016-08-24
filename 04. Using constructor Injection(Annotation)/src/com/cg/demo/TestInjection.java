package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestInjection {
	public static void main(String args[]){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		ctx.refresh(); // very important to write this.
		Employee e = ctx.getBean("employee",Employee.class);
		System.out.println(e);
	}
}
