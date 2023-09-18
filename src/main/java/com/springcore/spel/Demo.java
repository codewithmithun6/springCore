package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Spring Expression Language @Value("#{expression}")

@Component
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	@Value("#{2+4+55+78}")
	private int y;
	
	// call to static method using expression
	// syntax -> T(class).method(parameter) 
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	// call to static variable using expression
	// syntax -> T(class).variable
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	// how to create object
	// syntax -> new Object(value)
	@Value("#{new java.lang.String('Mithun Kumar')}")
	private String name;
	
	// inserting boolean value by default is false
	@Value("#{ 10>5 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	

}
