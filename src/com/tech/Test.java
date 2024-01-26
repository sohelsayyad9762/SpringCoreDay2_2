package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
	Company c1=	(Company) ctx.getBean("comp");
	
	System.out.println(c1.getId());
	System.out.println(c1.getCname());
	System.out.println(c1.getEmployee());
	System.out.println(c1.getEmployee().getEname());
	System.out.println(c1.getEmployee().getEemail());
	System.out.println(c1.getEmployee().getAddress());
	System.out.println(c1.getEmployee().getAddress().getCityname());
	System.out.println(c1.getEmployee().getAddress().getPincode());

	}

}
