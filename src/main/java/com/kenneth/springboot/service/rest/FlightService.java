package com.kenneth.springboot.service.rest;

import java.util.List;

import com.kenneth.springboot.dto.FlightWithAirline;

public interface FlightService {
	void configureFlight(FlightWithAirline fwd);
	
	List<FlightWithAirline> getFlight();
}
