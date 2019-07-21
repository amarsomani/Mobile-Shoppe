package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Address;
import com.model.Company;
import com.model.RegularSeller;
import com.service.SellerService;


@Controller
public class HomeController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/ClientSignup")
	public ModelAndView clientSignup() {
		return new ModelAndView("RegularClientSignup");
	}
	
	@RequestMapping(value="/Sellerhome",method=RequestMethod.POST)
	public ModelAndView saveClient(HttpServletRequest request) {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String adhaar = request.getParameter("adhaar");
		
		String address = request.getParameter("address");
		String zipcode = request.getParameter("zipcode");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		
		Address ad = new Address();
		ad.setAddress(address);
		ad.setZipcode(zipcode);
		ad.setCity(city);
		ad.setState(state);
		ad.setCountry(country);
		
		RegularSeller rg = new RegularSeller();
		rg.setFirstName(fname);
		rg.setLastName(lname);
		rg.setEmail(email);
		rg.setAdharCardNo(adhaar);
		rg.setPhone(phone);
		rg.setPassword(password);
		rg.setAddress(ad);
		
		sellerService.addRegularClient(rg);
		
		ModelAndView md = new ModelAndView("RegularClientSignup");
		md.addObject("msge","Saved Successfully...........");
		return md;
	}
	
	@RequestMapping(value="/CompanySignup")
	public ModelAndView companySignup() {
		return new ModelAndView("CompanySignup");
	}
	
	@RequestMapping(value="/CompanyRegistration",method=RequestMethod.POST)
	public ModelAndView saveCompany(HttpServletRequest request) {
		String companyName = request.getParameter("cname");
		String parentCompany = request.getParameter("pname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String regNo = request.getParameter("regNo");
		
		String address = request.getParameter("address");
		String zipcode = request.getParameter("zipcode");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		
		Address ad = new Address();
		ad.setAddress(address);
		ad.setZipcode(zipcode);
		ad.setCity(city);
		ad.setState(state);
		ad.setCountry(country);
		
		Company company = new Company();
		company.setCompanyName(companyName);
		company.setParentCompany(parentCompany);
		company.setEmail(email);
		company.setCompanyRegistrationNumber(regNo);
		company.setPhone(phone);
		company.setPassword(password);
		company.setAddress(ad);
		
//		sellerService.addRegularClient(rg);
		sellerService.addCompany(company);
		
		ModelAndView md = new ModelAndView("RegularClientSignup");
		md.addObject("msge","Saved Successfully...........");
		return md;
	}
}
