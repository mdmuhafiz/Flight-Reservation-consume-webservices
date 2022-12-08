package com.checkinapplication.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.checkinapplication.dto.Reservation;
import com.checkinapplication.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	public Reservation findReservation(long id);

	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}
