package com.basics;


// single 
// multilevel

class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}

class Babydog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Babydog d = new Babydog();
		d.weep();
		d.bark();
		d.eat();
		
	}

}
