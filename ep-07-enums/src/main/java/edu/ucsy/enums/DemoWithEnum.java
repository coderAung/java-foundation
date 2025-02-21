package edu.ucsy.enums;

import edu.ucsy.enums.User.Status;

public class DemoWithEnum {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Aung Aung");
		user.setStatus(Status.Active);
	}
	
}

class User {
	private String name;
	private Status status;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status {
		Active, Inactive
	}
	
}
