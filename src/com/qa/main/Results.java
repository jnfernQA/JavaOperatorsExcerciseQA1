package com.qa.main;

public class Results {
	
	//Subject Variables Person got for each subject
	static int physics = 120;
	static double Biology = 100;
	static double Chemistry = 135;
	static double FullMarks = 150;
	
	//Method1
	public static void method1(String[] args) {
		System.out.println("Physics = " + physics + " out of " + FullMarks);
	}
	public static void method2(String[] args) {
		System.out.println("Chemistry = " + Chemistry + " out of " + FullMarks);
	}
	public static void method3(String[] args) {
		System.out.println("Biology = " + Biology + " out of " + FullMarks);
	}
	public static void method4(String[] args) {
		double TotalMarks = Biology + Chemistry + physics;
		double TotalRatio = TotalMarks / (FullMarks * 3);
		double OverallPercentage = TotalRatio * 100;
		System.out.println("Overall Percentage = " + OverallPercentage);
	}
	public static void main(String[] args) {
		method1(args);
		method2(args);
		method3(args);
		System.out.println("Total Mark = " + (physics+Biology+Chemistry) + " out of " + (FullMarks * 3));
		method4(args);
	}	
	
	
	
	//Method 2
	
	


}
