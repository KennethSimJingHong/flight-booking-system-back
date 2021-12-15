package com.kenneth.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	 
	@Column(name="number")
	private String number;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="flight_id")
	private Long flightId;
	
	@Column(name="user_id")
	private Long userId;
	
	@OneToMany(mappedBy="booking", cascade = CascadeType.ALL)
	private Set<Passenger> passengers = new HashSet<>();
	
	public Booking() {}

	public Booking(String number, Float price, int quantity, Long flightId, Long userId) {
		super();
		this.number = number;
		this.price = price;
		this.quantity = quantity;
		this.flightId = flightId;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public void add(Passenger passenger) {
		if(passenger != null) {
			if(passengers == null) {
				passengers = new HashSet<>();
			}
			passengers.add(passenger);
			passenger.setBooking(this);
		}
	}
	
}
