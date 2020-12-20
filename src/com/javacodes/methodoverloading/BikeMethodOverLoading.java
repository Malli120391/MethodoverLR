package com.javacodes.methodoverloading;

public class BikeMethodOverLoading {
	
	private String startMethod = "Kick";

    public void start(){
        System.out.println(startMethod + " starting ....");
    }

    public void start(String method){
        this.startMethod = method;
        System.out.println(startMethod + " starting ....");
    }

	public static void main(String[] args) {

		    BikeMethodOverLoading motorBike = new BikeMethodOverLoading();
	        motorBike.start();
	        motorBike.start("Self"); 
	}

}
