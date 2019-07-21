package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.model.validator.Phone;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Seller {
	
	@Id
	@Column(name="Seller_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	@Email @NotEmpty
	@Column(nullable=false,length=45)
	private String email;
	
	@Phone @NotNull
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@NotNull
	@JoinColumn(name="AddressId")
	private Address address;
	
	@NotNull
	@Column(nullable=false)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
