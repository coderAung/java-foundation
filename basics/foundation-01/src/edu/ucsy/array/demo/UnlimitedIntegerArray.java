package edu.ucsy.array.demo;

public class UnlimitedIntegerArray {
	
	private int [] array;

	public UnlimitedIntegerArray() {
		this.array = new int[0];
	}
	
	public void add(int number) {
		int [] temp = new int[array.length + 1];
		
		for(int i = 0; i < array.length; i ++) {
			temp[i] = array[i];
		}
		
		temp[temp.length - 1] = number;
		array = temp;
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
