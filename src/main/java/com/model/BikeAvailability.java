package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
public class BikeAvailability {
	
	@Id
	@Column(name="Bike_id", unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters={@Parameter(name="property", value="bike")})
	private int id;
	
	@NotNull
	private boolean availabilty;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Bike bike;

}
