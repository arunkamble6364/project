package com.basics;

class Address {

	String streetName = "Tilak Road";
	String city = "Pune";
	int pin = 411057;

}

class StudentDetails{
	
	int rollNo;
	String name;
	private Address address;
	
	public void addressDetails() {
		address  = new Address();
		System.out.println(address.streetName + " " + address.city + " " + address.pin);
	}
}

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails s1 = new StudentDetails();
		s1.addressDetails();
		
	}

}
