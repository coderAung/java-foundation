package edu.ucsy.oop.demo;

import edu.ucsy.oop.domain.Person;
import edu.ucsy.oop.domain.Student;
import edu.ucsy.oop.domain.Teacher;

public class Demo {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Daw Hla");
		teacher.teach();
		
		Student student = new Student("Aung Aung");
		student.study();
		
		System.out.println();
		
		doWork(teacher);
		
		doWork(student);
	}
	
	static void doWork(Person person) {
		person.doWork();
	}
	
}
