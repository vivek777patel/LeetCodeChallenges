package com.practice;

public class Dog {

	public String mBreed; // class variable
	
	public Dog() {
		mBreed = "Maltese";
		System.out.println("hi");
		int age; // class variable
	}
	
	public int mAge; // class variable
	
	public Dog(String breed) {
		mBreed = breed;
	}
	
	// Signature of constructor
	public Dog(int age) {
		mAge = age;
	}
	
	// Signature of constructor
	public Dog(String breed,int age) {
		mBreed = breed;
		mAge = age;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String breed = "Bulldog";
		System.out.println(breed);
		Dog d = new Dog();
		System.out.println(d.mBreed);
		System.out.println(d.mAge);
		Dog d1 = new Dog("pug");
		System.out.println(d1.mBreed);
		System.out.println(d.mBreed);
		System.out.println(d1.mAge);
		System.out.println("hello");
		Dog d2 = new Dog("Beagle",2);
		System.out.println(d2.mBreed);
		System.out.println(d2.mAge);
	}

}
