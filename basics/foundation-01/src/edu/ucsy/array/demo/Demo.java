package edu.ucsy.array.demo;

import java.util.Scanner;

public class Demo {

	private static final Scanner scanner = new Scanner(System.in);

	private int[] array;

	public Demo() {
		this.array = new int[0];
	}

	public static void main(String[] args) {
		new Demo().run();
	}

	// instance method
	private void run() {
		System.out.println("Welcome");
		do {

			System.out.print("Enter a number : ");
			String input = scanner.nextLine();
			int number = Integer.parseInt(input);

			if (number == 0) {
				break;
			}

			// add to array
			addToArray(number);

		} while (true);
		
		// total
		int total = getTotal();
		
		// count
		int count = array.length;
		
		// average
		int avg = 0;
		if(count > 0) {
			avg = total / count;
		}
		
		System.out.printf("Total   : %s%n", total);
		System.out.printf("Count   : %s%n", count);
		System.out.printf("Average : %s%n", avg);
		System.out.println("Good Bye");
	}

	private int getTotal() {
		// enhance for
		int total = 0;
		for(int a : array) {
			total += a;
		}
		return total;
	}
	
	private void addToArray(int number) {
		// copy array
		// add to new array
		// assign new array to og array
		int[] temp = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}

		temp[temp.length - 1] = number;
		array = temp;
	}
}
