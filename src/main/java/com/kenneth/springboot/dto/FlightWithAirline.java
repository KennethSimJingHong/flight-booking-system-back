package com.kenneth.springboot.dto;

import com.kenneth.springboot.model.Airline;
import com.kenneth.springboot.model.Flight;

public class FlightWithAirline {

	private Flight flight;
	
	private Airline airline;
	
	public FlightWithAirline() {};
	
	public FlightWithAirline(Flight flight, Airline airline) {
		this.flight = flight;
		this.airline = airline;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "FlightWithAirline [flight=" + flight + ", airline=" + airline + "]";
	}

}
