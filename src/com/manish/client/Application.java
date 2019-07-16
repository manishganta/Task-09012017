package com.manish.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.model.UserDetails;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDetails userDetails = (UserDetails) ctx.getBean("userBean", UserDetails.class);
		
		System.out.println(userDetails.getUserName()+ "\t"+userDetails.getPassword());
		
		
		((AbstractApplicationContext) ctx).close();

	}

}
