package edu.ucsy.array;

import java.util.Scanner;

public class ArrayTest {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// total
		// count
		// average
		int [] array = new int[5];
		
		int input = 0;
		int index = 0;
		do {
			
			System.out.print("Enter a number : ");
			String str = scanner.nextLine();
			input = Integer.parseInt(str);
			array[index] = input;
			
			index ++;
			
		} while(index < 5);
		
		int total = 0;
		for(int i = 0; i < array.length; i ++) {
			total += array[i];
		}
		int avg = total / array.length;
		int count = array.length;
		
		System.out.printf("Total   : %s%n", total);
		System.out.printf("Count   : %s%n", count);
		System.out.printf("Average : %s%n", avg);

	}
}
