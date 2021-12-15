package com.kenneth.springboot.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenneth.springboot.dto.FlightWithAirline;
import com.kenneth.springboot.service.rest.FlightService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/flight")
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@PostMapping("/create")
	public void createFlight(@RequestBody FlightWithAirline fwd) {
		flightService.configureFlight(fwd);
	}
	
	@GetMapping("/get")
	public List<FlightWithAirline> getFlight() {
		return flightService.getFlight();
	}
}
