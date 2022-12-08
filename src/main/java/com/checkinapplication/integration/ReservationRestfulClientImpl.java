package com.checkinapplication.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.checkinapplication.dto.Reservation;
import com.checkinapplication.dto.ReservationUpdateRequest;
@Component
public class ReservationRestfulClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation", request, Reservation.class);
		return reservation;
	}

}
