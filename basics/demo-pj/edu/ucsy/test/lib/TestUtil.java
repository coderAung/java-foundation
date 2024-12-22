package edu.ucsy.test.lib;

public class TestUtil {

	public static void assertEquals(double expected, double actual) {
		if(expected == actual) {
			System.out.println("--------- Test Success ---------");
		} else {
			System.out.println("xxxxxxxxx Test Fail xxxxxxxxx");
			System.out.printf("Expected Value : %s but Actual Value : %s%n", expected, actual);
		}
		System.out.println();
	}
}