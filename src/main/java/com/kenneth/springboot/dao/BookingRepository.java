package com.kenneth.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kenneth.springboot.model.Booking;

@CrossOrigin(origins="*")
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
