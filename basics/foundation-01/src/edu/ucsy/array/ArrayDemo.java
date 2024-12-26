package edu.ucsy.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] a1 = {10, 20, 30, 40};
		System.out.println("Array a1");
		
		for(int data : a1) {
			System.out.println(data);
		}
		
		System.out.println("=============");
		
		int [] a2 = {5, 15, 25, 35, 45};
		System.out.println("Array a2");
		
		for(int data : a2) {
			System.out.println(data);
		}

		System.out.println("=============");

		a1 = a2;
		
		a2[3] = 999;
		System.out.println("Array a1");
		for(int data : a1) {
			System.out.println(data);
		}
		System.out.println("=============");
	}
}
