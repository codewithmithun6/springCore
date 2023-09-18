package com.springcore.ci;

public class Addition {
	
	private int num1;
	private int num2;
	
	public Addition(double num1,double num2) {
		System.out.println("Constructor : double, double");
		this.num1=(int)num1;
		this.num2=(int)num2;
	}
	
	
	public Addition(int num1,int num2) {
		System.out.println("Constructor : int, int");
		System.out.println();
		this.num1=num1;
		this.num2=num2;
	}
	
	
	
	public Addition(String num1,String num2) {
		System.out.println("Constructor : String, String");
		this.num1=Integer.parseInt(num1);
		this.num2=Integer.parseInt(num2);
		
	}
	
	
	public void doSum() {
		System.out.println("Value of num1: "+num1);
		System.out.println("Value of num2: "+num2);
		System.out.println("Sum is :"+(this.num1+this.num2));
	}

}
