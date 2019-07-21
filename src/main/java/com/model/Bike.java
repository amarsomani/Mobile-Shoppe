package com.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="bike")
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bikeId")
	private int id;
	
	@NotNull
	private String registrationNo;
	
	@NotNull
	private String engineNo;
	
	@NotNull
	private String modelName;
	
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date yearOfManufacturing;
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	private Seller seller;
	
	@Transient
	private MultipartFile image;
	
	
	
//	@OneToOne(mappedBy="bike")
//	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//	private BikeAvailability bikeAvailability;
//	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

	public Date getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(Date yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
		
}
