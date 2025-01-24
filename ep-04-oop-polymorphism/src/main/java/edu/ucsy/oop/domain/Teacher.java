package edu.ucsy.oop.domain;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void doWork() {
		teach();
	}
	
	public void teach() {
		System.out.printf("%s is teaching.%n", getName());
	}
}
