package com.basics;

class Student {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(rollNo + " " + name + " " + age );
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Pranav");
		Student s2 = new Student(2, "Sumit", 26);
		s1.display();
		s2.display();

	}

}
