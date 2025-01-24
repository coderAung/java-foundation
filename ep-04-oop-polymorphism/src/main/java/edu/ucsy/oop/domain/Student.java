package edu.ucsy.oop.domain;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	@Override
	public void doWork() {
		study();
	}

	public void study() {
		System.out.printf("%s is studying.%n", getName());
	}
	
}
