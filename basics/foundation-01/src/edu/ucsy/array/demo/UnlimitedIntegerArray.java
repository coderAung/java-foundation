package edu.ucsy.array.demo;

import java.util.Arrays;

public class UnlimitedIntegerArray {
	
	private int [] array;

	public UnlimitedIntegerArray() {
		this.array = new int[0];
	}
	
	public void add(int number) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = number;
	}
	
	public int getTotal() {
		int total = 0;
		for(int a : array) {
			total += a;
		}
		return total;
	}
	
	public int getSize() {
		return array.length;
	}
	
	public int getAverage() {
		if(getSize() > 0) {
			return getTotal() / getSize();
		}
		return 0;
	}
}
