package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@DiscriminatorValue("Company")
public class Company extends Seller{
	
	
	@Column(nullable=false,length=30)
	private String companyName;
	
	
	private String companyRegistrationNumber;
	
	private String parentCompany;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="AddressId")
	private Address address;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	public String getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(String parentCompany) {
		parentCompany = parentCompany;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
