package com.javacodes.methodoverriding;

 class Animal{
	 
public void sound() {
	
	System.out.println("This is main class");
	
}

 }
 class Dog extends Animal{
	
	 public void sound() {
		 super.sound();
		 System.out.println("Dogs bark");
	 }
 }

 class Cats extends Animal{
	 public void sound() {
		 System.out.println("Cats meow");
	 }
 }
class Bakara  extends Animal{
	public void sound() {
		 System.out.println("Bakara me mayyyyyyyy");
		
	}
}
public class Animalsss {
	
	public static void main(String[] args) {

		Animal d = new Dog();
		Animal c = new Cats();
		Animal B = new Bakara();
		  d.sound();
		  c.sound();
		  B.sound();
	}

}
