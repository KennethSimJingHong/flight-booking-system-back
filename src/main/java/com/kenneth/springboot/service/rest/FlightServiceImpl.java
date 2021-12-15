package com.kenneth.springboot.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenneth.springboot.dao.AirlineRepository;
import com.kenneth.springboot.dao.FlightRepository;
import com.kenneth.springboot.dto.FlightWithAirline;
import com.kenneth.springboot.model.Airline;
import com.kenneth.springboot.model.Flight;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private AirlineRepository airlineRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	@Override
	@Transactional
	public void configureFlight(FlightWithAirline fwd) {
		Flight flight = fwd.getFlight();
		
		Airline airline = fwd.getAirline();
		
		airline.add(flight);

		flightRepo.save(flight);
		
		airlineRepo.save(airline);
		
	}


	@Override
	public List<FlightWithAirline> getFlight() {
		List<FlightWithAirline> fwdList = new ArrayList<>();
		
		List<Airline> airlines = airlineRepo.findAll();
		System.out.println(airlines);
		
		List<Flight> flights = flightRepo.findAll();
		System.out.println(flights);
		
		
		for(int i = 0; i < flights.size(); i++) {
			Flight flight = flights.get(i);
			Airline result = airlines.stream().filter(airline -> airline.getId() == flight.getAirline().getId()).findAny().orElse(null);
			fwdList.add(new FlightWithAirline(flights.get(i), result)); 
		}
		
		System.out.println(fwdList);
		
		return fwdList;
	}

}
