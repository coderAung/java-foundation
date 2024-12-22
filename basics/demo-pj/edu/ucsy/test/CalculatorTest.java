package edu.ucsy.test;

import edu.ucsy.area.lib.Calculator;
import static edu.ucsy.test.lib.TestUtil.assertEquals;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	public static void main(String[] args) {
		test_add();
		test_div();
	}

	private static void test_add() {
		System.out.println("Test Add");
		double n1 = 3;
		double n2 = 5;

		assertEquals(8, calculator.add(n1, n2));
	}

	private static void test_div() {
		System.out.println("Test Div");
		double n1 = 15;
		double n2 = 3;
		assertEquals(5, calculator.div(n1, n2));
	}

	private static void test_double() {
		
	}

}