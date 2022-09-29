package com.basics;

final class Person {

	final String PAN_NUMBER;

	public Person(String pAN_NUMBER) {
		super();
		PAN_NUMBER = pAN_NUMBER;
	}

	public String getPAN_NUMBER() {
		return PAN_NUMBER;
	}

}

public class ImmutableClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("GNK123");
		String s1 = p.getPAN_NUMBER();
		System.out.println(s1);

	}

}
