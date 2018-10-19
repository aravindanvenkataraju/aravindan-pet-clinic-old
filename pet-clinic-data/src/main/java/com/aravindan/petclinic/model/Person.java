package com.aravindan.petclinic.model;

public class Person extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1552951972470871565L;
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
