package com.javacodes.methodoverriding;

public class CarFord {
	
	   public int speed() {
		   return 100;
	   }
}
  class Bez extends CarFord{
	  
	  public int speed() {
		  return 250;
	  }
  

	public static void main(String[] args) {
		
		CarFord cf = new Bez();
		int speedlimit = cf.speed();
		System.out.println("Speed Limit is:" +speedlimit);

	}

}
