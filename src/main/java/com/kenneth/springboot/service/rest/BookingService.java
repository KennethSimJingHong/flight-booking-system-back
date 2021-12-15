package com.kenneth.springboot.service.rest;

import com.kenneth.springboot.dto.BookingWithPassenger;

public interface BookingService {
	void saveBooking(BookingWithPassenger bwp);
}
