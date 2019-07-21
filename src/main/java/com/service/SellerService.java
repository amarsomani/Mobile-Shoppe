package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SellerDao;
import com.model.Company;
import com.model.RegularSeller;

@Transactional
@Service("sellerService")
public class SellerService {

	@Autowired
	private SellerDao sellerDao;
	
	public void addRegularClient(RegularSeller regularSeller) {
		sellerDao.addRegularClient(regularSeller);
	}

	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		sellerDao.addCompany(company);
	}
}
