package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("RS")
public class RegularSeller extends Seller {

	private String firstName;
	private String lastName;
	private String AdharCardNo;

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

	public String getAdharCardNo() {
		return AdharCardNo;
	}

	public void setAdharCardNo(String adharCardNo) {
		AdharCardNo = adharCardNo;
	}
	
	
}
