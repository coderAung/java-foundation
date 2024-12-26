package edu.ucsy.array;

public class ArrayUsageDemo {

	public static void main(String[] args) {
		
		// size = 4, lastIndex = 3
		int [] array = {30, 40, 50 , 60};
		
		System.out.println("classic for loop");
		
		for(int i = 0; i < array.length; i ++) {
			int data = array[i];
			System.out.println(data);
		}
		
		System.out.println("Enhance for loop");
		for(int data : array) {
			System.out.println(data);
		}
		
	}
}
