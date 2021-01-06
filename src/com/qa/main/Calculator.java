package com.qa.main;

public class Calculator {
	
	//Variables
	static double num1 = 12;
	static double num2 = 10;
	
	//Methods
	public static void main(String[] args) {
	
	//Method Addition
	
	double result = num1 + num2;
	System.out.println(result);
	
	
	//Method Multiplication
	
	double result1 = num1 * num2;
	System.out.println(result1);
	
	
	//Method Subtraction
	
	double result2 = num1 - num2;
	System.out.println(result2);
	
	
	//Method Division (had to change int to double)
	
	double result3 = num1 / num2;
	System.out.println(result3);
	}

}
