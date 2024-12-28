package edu.ucsy.array.demo;

import java.util.Scanner;

public class DemoVersion2 {

	private static final Scanner scanner = new Scanner(System.in);
	
	private UnlimitedIntegerArray array;
	
	public DemoVersion2() {
		this.array = new UnlimitedIntegerArray();
	}

	public static void main(String[] args) {
		new DemoVersion2().run();
	}

	private void run() {
		System.out.println("Welcome");
		do {

			int number = getIntInput("Enter a number : ");
			
			int width = getIntInput("Enter width : ");
			int height = getIntInput("Enter height : ");
			
			if (number == 0) {
				break;
			}
			
			array.add(number);

		} while (true);
		
		// total
		int total = array.getTotal();
		// count
		int count = array.getSize();
		
		// average
		int avg = array.getAverage();
		
		System.out.printf("Total   : %s%n", total);
		System.out.printf("Count   : %s%n", count);
		System.out.printf("Average : %s%n", avg);
		
		System.out.println("Good Bye");

	}
	
	private int getIntInput(String msg) {
		System.out.print(msg);
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		return number;
	}
}
