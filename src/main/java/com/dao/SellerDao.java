package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Company;
import com.model.RegularSeller;

@Repository("sellerDao")
public class SellerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addRegularClient(RegularSeller regularSeller) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(regularSeller);

	}

	public void addCompany(Company company) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(company);
		
	}
}
