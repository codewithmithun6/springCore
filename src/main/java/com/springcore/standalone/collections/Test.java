package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		Person person1 = con.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		
//		Person person2 = con.getBean("person2",Person.class);
//		System.out.println(person2);
		
		
		System.out.println("_________________________________________________________");		
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		
		System.out.println("_____________________________________________________________");
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass().getName());
		

	}

}
