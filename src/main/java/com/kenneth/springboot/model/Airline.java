package com.kenneth.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="airlines")
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "airline", cascade = CascadeType.MERGE)
	private Set<Flight> flights = new HashSet<>();

	public Airline() {}
	
	public Airline(String name) {
		super();
		this.name = name;
	}
	
	public void add(Flight flight) {
		if(flight != null) {
			if(flights == null) {
				flights = new HashSet<>();
			}
			flights.add(flight);
			flight.setAirline(this);
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
