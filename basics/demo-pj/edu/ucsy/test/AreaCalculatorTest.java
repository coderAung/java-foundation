package edu.ucsy.test;

import edu.ucsy.area.AreaCalculator;

public class AreaCalculatorTest {

	private static final double circleAreaResult = 1963.75;

	private static AreaCalculator cal = new AreaCalculator();

	public static void main(String[] args) {

		test_get_square_area();

		test_get_circle_area();
	}

	private static void test_get_square_area() {
		System.out.println("Square Area Test");
		var squareArea = cal.getSquareArea(20, 30);

		TestUtil.assertEquals(600.0, squareArea);
	}

	private static void test_get_circle_area() {
		System.out.println("Circle Area Test");
		var circleArea = cal.getCircleArea(25);

		TestUtil.assertEquals(circleAreaResult, circleArea);
	}

}