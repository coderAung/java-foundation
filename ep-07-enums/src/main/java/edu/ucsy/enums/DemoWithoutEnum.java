package edu.ucsy.enums;

import java.util.Scanner;

public class DemoWithoutEnum {

	private static final String [] days = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public enum Days {
		Mon, Tue, Wed, Thur, Fri, Sat, Sun
	}
	
	public static void main(String[] args) {
		// method with if else
//		demo1();
		
		demo2("kdaei");
		demo3(Days.Sat);
		demo3(Days.Mon);
	}
	
	public static int getInput(String msg) {
		System.out.printf("%s : ", msg);
		String input = scanner.nextLine();
		return Integer.parseInt(input);
	}
	
	static void demo1() {
		int input = getInput("Enter day number");
		if(input > days.length - 1 || input < 0) {
			System.out.println("Invalid input.");
		} else {
			System.out.println(days[input]);
		}

	}
	
	static void demo3(Days day) {
		switch(day) {
		case Days.Mon:
		case Days.Tue:
		case Days.Wed:
		case Days.Thur:
		case Days.Fri:
			System.out.println("Weeks day");
			break;
		case Days.Sat:
		case Days.Sun:
			System.out.println("Weekend day");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
	
	static void demo2(String day) {
		switch(day) {
		case "Mon":
		case "Tue":
		case "Wed":
		case "Thur":
		case "Fri":
			System.out.println("Weeks day");
			break;
		case "Sat":
		case "Sun":
			System.out.println("Weekend day");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
