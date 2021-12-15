package com.kenneth.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kenneth.springboot.model.Airline;

@CrossOrigin(origins="*")
@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
