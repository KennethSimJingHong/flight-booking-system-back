package com.kenneth.springboot.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenneth.springboot.dao.BookingRepository;
import com.kenneth.springboot.dto.BookingWithPassenger;
import com.kenneth.springboot.service.rest.BookingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingSevice;
	

	@PostMapping("/create")
	public void createBooking(@RequestBody BookingWithPassenger bwp) {
		bookingSevice.saveBooking(bwp);
	}

}
