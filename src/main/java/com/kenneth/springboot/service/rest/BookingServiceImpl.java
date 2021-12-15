package com.kenneth.springboot.service.rest;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenneth.springboot.dao.BookingRepository;
import com.kenneth.springboot.dao.FlightRepository;
import com.kenneth.springboot.dao.PassengerRepository;
import com.kenneth.springboot.dao.UserRepository;
import com.kenneth.springboot.dto.BookingWithPassenger;
import com.kenneth.springboot.model.Booking;
import com.kenneth.springboot.model.Flight;
import com.kenneth.springboot.model.Passenger;
import com.kenneth.springboot.model.User;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	@Transactional
	public void saveBooking(BookingWithPassenger bwp) {
		Booking newBooking = new Booking(bwp.getBooking().getNumber(), bwp.getBooking().getPrice(), bwp.getBooking().getQuantity(), bwp.getBooking().getFlightId(), bwp.getBooking().getUserId());
		
		
		List<Passenger> passengers = Arrays.asList(bwp.getPassengers());
		
		passengers.stream().forEach(passenger -> {
			newBooking.add(passenger);
			passengerRepository.save(passenger);
		});
		
		bookingRepository.save(newBooking);
	}

}
