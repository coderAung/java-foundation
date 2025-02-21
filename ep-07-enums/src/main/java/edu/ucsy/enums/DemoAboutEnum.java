package edu.ucsy.enums;

public class DemoAboutEnum {
	
	public static void main(String[] args) {
		System.out.println(Status.Active.title());
		System.out.println(Status.Active.name());
		
		Status status = Status.valueOf("Inactive");
		System.out.println(status.title());
		System.out.println("+++++++++++++++++++++++++++++++++");
		Status [] array = Status.values();
		for(Status s : array) {
			System.out.println(s);
		}
	}
}

enum Status {
	Active("Active User"), Inactive("Inactive"), Banned("Banned");
	
	private String title;
	
	public String title() {
		return title;
	}
	
	private Status(String title) {
		this.title = title;
	}
}