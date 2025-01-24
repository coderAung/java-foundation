package edu.ucsy.oop.domain;

public class Person {

	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void doWork() {
		System.out.printf("%s is working.%n", name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
