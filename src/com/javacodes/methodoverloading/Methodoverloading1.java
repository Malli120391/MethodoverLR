package com.javacodes.methodoverloading;

public class Methodoverloading1 {
	
	public static void printArea(int x,int y){
	    System.out.println(x*y);
	  }
	  public static void printArea(int x){
	    System.out.println(x*x);
	  }
	  public static void printArea(int x,double y){
	    System.out.println(x*y);
	  }
	  public static void printArea(double x){
	    System.out.println(x*x);
	  }

	public static void main(String[] args) {
		
		
		printArea(10, 5);
	    printArea(5);
		printArea(20.5);
		printArea(2, 10.5);

		
	}

}
