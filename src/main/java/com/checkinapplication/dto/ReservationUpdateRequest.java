package com.checkinapplication.dto;

public class ReservationUpdateRequest {
	private long id;
	private int numberOfBags;
	private boolean checkedIn;
	public long getId() {
		return id;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	

}
