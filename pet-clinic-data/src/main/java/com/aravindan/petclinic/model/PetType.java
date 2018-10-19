package com.aravindan.petclinic.model;

public class PetType extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3830887042151629234L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
