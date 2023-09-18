package com.springcore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext Context =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		
		 Person  p = (Person)Context.getBean("person");
		 System.out.println(p);
		 
		Addition add=(Addition)Context.getBean("add");		
		add.doSum();
		

	}

}
