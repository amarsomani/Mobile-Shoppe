package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.Bike;

@Repository("bikeDao")
public class BikeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Bike> searchAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Bike.class).list();
	}
	
	public void addBike(Bike bike) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bike);
	}
}
