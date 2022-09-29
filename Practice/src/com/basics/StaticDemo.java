package com.basics;

class StudentInfo {

	int rollNo;
	String name;
	
	// static variable
	static String college = "DYP";

	public StudentInfo(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println(rollNo + " " + name + " " + college);
	}
	
	// static method
	static void change() {
		college = "KIT";
	}
	
	// static block 
	static {
		System.out.println("Hello  gm");
	}

}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static method called by class name
		StudentInfo.change();
		StudentInfo s1 = new StudentInfo(1, "Suraj");
		StudentInfo s2 = new StudentInfo(2, "Kishor");
		s1.display();
		s2.display();
		
		System.out.println("Welcome");
	}

}
