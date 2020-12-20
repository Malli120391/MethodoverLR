package com.javacodes.methodoverriding;

abstract class TestDemo {
	
	public abstract void demoMethod();
	
	public void normalMethod(){
        System.out.println("This is a normal method");
    }


	/*
	 *public class DemoApp extends TestDemo{
	 * 
	 * @Override public void demoMethod() {
	 * System.out.println("Abstract method is implemented"); }
	 */

    public static void main(String[] arg) {
        DemoApp demoApp = new DemoApp();
        demoApp.demoMethod();
        demoApp.normalMethod(); 
     
    }
}