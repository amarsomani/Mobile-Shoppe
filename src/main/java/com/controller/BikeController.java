package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Bike;
import com.service.BikeService;

@Controller
public class BikeController {
	
	
	@Autowired
	private BikeService bikeService;
	
	
	
	@RequestMapping(value="/listBikes")
	public ModelAndView searchAllBikes() {
		List<Bike> bikes = bikeService.searchAll();
		ModelAndView md = new ModelAndView("listBikes");
		md.addObject("bikes", bikes);
		return md;
	}
	
	@RequestMapping(value = "/bike/save", method = RequestMethod.GET)
	public ModelAndView saveCustomerPage(Model model) {
		
		ModelAndView md = new ModelAndView("insertBike");
		return md;
	}

//	@RequestMapping(value="/bike/addBike",method=RequestMethod.POST)
//	public ModelAndView addBike(@ModelAttribute("bike")Bike bike) throws IOException {
//		
//		byte[] bytes = bike.getImage().getBytes();
//		File image = new File("D:\\eclipse-workspace\\Spring MVC\\ZoomScooter\\WebContent\\WEB-INF\\image",bike.getRegistrationNo()+".jpeg");
//		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(image));
//		stream.write(bytes);
//		stream.close();
//		
//		bikeService.addBike(bike);
//		return new ModelAndView("saveBike");
//	}
	
	@RequestMapping(value="/bike/addBike",method=RequestMethod.POST)
	public ModelAndView addBike(HttpServletRequest request,@RequestParam("image")MultipartFile file) throws ParseException, IOException {
		String regNo = request.getParameter("registrationNo");
		String engineNo = request.getParameter("engineNo");
		String modelName = request.getParameter("modelName");
		String Sdate = request.getParameter("yearOfManufacturing");
		DateFormat formDate = new SimpleDateFormat ("yyyy-MM-dd");
		System.out.println(Sdate);
		Date yearOfManufacturing = formDate.parse(Sdate);
		
		byte[] bytes = file.getBytes();
		File image = new File("WEB-INF\\image",regNo+".jpeg");
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(image));
		stream.write(bytes);
		stream.close();
		
		Bike bike = new Bike();
		bike.setRegistrationNo(regNo);
		bike.setEngineNo(engineNo);
		bike.setModelName(modelName);
		bike.setYearOfManufacturing(yearOfManufacturing);
		
		bikeService.addBike(bike);
		
		ModelAndView md = new ModelAndView("saveBike");
		md.addObject("bike",bike);
		return md;
		
	}
}
