package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BikeDao;
import com.model.Bike;

@Transactional
@Service("bikeService")
public class BikeService {
	
	@Autowired BikeDao bikeDao;
	
	
	public List<Bike> searchAll(){
		return bikeDao.searchAll();
	}
	
	public void addBike(Bike bike) {
		bikeDao.addBike(bike);
	}
	
}
