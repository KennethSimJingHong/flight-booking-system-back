package com.kenneth.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kenneth.springboot.model.Flight;

@CrossOrigin(origins="*")
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
