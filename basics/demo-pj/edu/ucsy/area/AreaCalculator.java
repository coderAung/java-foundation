package edu.ucsy.area;

import edu.ucsy.area.lib.Calculator;

public class AreaCalculator {

	private static final double PI = 3.142;

	private Calculator calculator;

	public AreaCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public double getSquareArea(double width, double height) {
		return calculator.mul(width, height);
	}

	public double getCircleArea(double radius) {
		return calculator.mul(PI, calculator.square(radius));
	}

	public double getCircumference(double radius) {
		return calculator.mul(PI, calculator.getDouble(radius));
	}
}