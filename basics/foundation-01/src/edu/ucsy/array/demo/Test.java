package edu.ucsy.array.demo;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int [] array = {99, 334, 20, 1, 999, 29394};
		
		System.out.println("Before Sorting");
		show(array);
		System.out.println();
		Arrays.sort(array);
		System.out.println("After Sorting");
		show(array);
	}
	
	
	private static void show(int [] array) {
		for(int a : array) {
			System.out.println(a);
		}
	}
}
