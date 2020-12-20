package com.javacodes.methodoverloading;

public class Methodoverloading2 {
	
	  public int sum(int x, int y) {
		 return(x+y);
	  }
	  public int sum(int x, int y, int z) {
		  return(x*y*z);
	  }
	  public double sum(double x, double y) {
		  return(x+y);
	  }

	public static void main(String[] args) {

		Methodoverloading2 mv = new Methodoverloading2();
		System.out.println("Sum of X+Y:" +mv.sum(10, 20));
		System.out.println("Sum of X*Y*Z:" +mv.sum(2, 3, 6));
		System.out.println("Sum of X+Y:" +mv.sum(5, 5));
		
	}

}
