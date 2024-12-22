package edu.ucsy.area;

import java.util.Scanner;
import edu.ucsy.area.lib.*;

public class AreaApp {

	private static final Scanner scanner = new Scanner(System.in);
	private AreaCalculator calculator;
	private NumberUtil numberUtil;

	public AreaApp() {
		this.calculator = new AreaCalculator(new Calculator());
		this.numberUtil = new NumberUtil();
	}

	public static void main(String[] args) {
		new AreaApp().run();
	}

	void run() {
		do {
			// Ask input for shape
			System.out.println("Enter 1 for Square");
			System.out.println("Enter 2 for Circle");
			System.out.print(">>> ");
			String shape = scanner.nextLine();

			// Ask input values
			if("1".equals(shape)) {

				double width = getDoubleInput("Enter Width  : ");
				double height = getDoubleInput("Enter Height : ");
				double area = calculator.getSquareArea(width, height);
				// Output area
				System.out.printf("Square area = %s%n", area);
				System.out.println("========================");
			} else if("2".equals(shape)) {
			// Output area

			} else {
				System.out.println("Wrong Input");
			}

			// Ask to continue
		} while(askContinue());

	}

	private boolean askContinue() {
		System.out.print("Do you want to continue? (y/n) : ");		
		String value = scanner.nextLine();
		if("y".equalsIgnoreCase(value)) {
			return true;
		} else {
			return false;
		}
	}

	private double getDoubleInput(String message) {
		System.out.print(message);
		String value = scanner.nextLine();
		return numberUtil.getDouble(value);
	}
}