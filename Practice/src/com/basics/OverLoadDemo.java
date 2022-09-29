package com.basics;

class Addition{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
}

public class OverLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1 = new Addition();
		System.out.println(a1.add(12, 10));
		System.out.println(a1.add(3, 2, 10));
		System.out.println(a1.add(1.2, 2.3));
		

		
	}

}
