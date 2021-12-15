package com.kenneth.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kenneth.springboot.model.Passenger;

@CrossOrigin(origins="*")
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
