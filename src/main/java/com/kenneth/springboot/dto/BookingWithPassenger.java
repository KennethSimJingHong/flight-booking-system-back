package com.kenneth.springboot.dto;

import java.util.Arrays;

import com.kenneth.springboot.model.Booking;
import com.kenneth.springboot.model.Passenger;
import com.kenneth.springboot.model.User;

public class BookingWithPassenger {

	private Booking booking;
	
	private Passenger[] passengers;
	
	public BookingWithPassenger() {}

	public BookingWithPassenger(Booking booking, Passenger[] passengers) {
		super();
		this.booking = booking;
		this.passengers = passengers;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

}
