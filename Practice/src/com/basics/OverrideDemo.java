package com.basics;

class Bike {
	
	public void run() {
		System.out.println("bike is running ");
	}
	
}

class Honda extends Bike{
	
	public void run() {
		
		System.out.println("It is running with 60km/hr");
	}
}


public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Honda();
		b.run();
		
	}

}
