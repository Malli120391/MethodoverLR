package com.javacodes.methodoverloading;

public class MainMethodOverload {
	

	public static void main(String[] args) {

		System.out.println("Hi java Codes (from main)");
		MainMethodOverload.main("JavaCodes");
	}
   
	
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        MainMethodOverload.main("Java", "My Codes"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
}
