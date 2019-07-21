package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.model.validator.Phone;

@Entity
public class Customer {
	
	@Id
	@Column(name="CUST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  customerId;
	
	@Column(nullable=false)
	private String firstName;
	private String lastName;
	
	@Email @NotNull
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;
	
	
	@Phone @NotNull
	@Column(name="Contact Number",nullable=false)
	private String phone;
	
	@NotNull
	@Column(name="Driving_License",nullable=false)
	private String drivingLicense;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name="AddressId")
	private Address address;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "cartId")
//	@Column(nullable=false)
//	private Cart cart;
	


}
