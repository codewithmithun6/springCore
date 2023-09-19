package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component  // removing component and adding bean annotation in javaCOnfig class
public class Student {
	
	private Samosa samosa;
	
	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book..");
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	

}
