package com.checkinapplication.dto;



public class Reservation {
	private long id;
	private boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	public long getId() {
		return id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
}
