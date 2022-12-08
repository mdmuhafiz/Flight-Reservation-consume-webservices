package com.checkinapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.checkinapplication.dto.Reservation;
import com.checkinapplication.dto.ReservationUpdateRequest;
import com.checkinapplication.integration.ReservationRestClient;

@Controller
public class ReservationcheckinController {
	@Autowired
	private ReservationRestClient restClient;
	
	@RequestMapping("/showcheckin")
	public String showcheckin() {
		
		return "startcheckin";
		
	}
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") long id,ModelMap model) {
		Reservation reservation = restClient.findReservation(id);
		model.addAttribute("reservation", reservation);
		
		return "show_reservation";
		
	}
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") long id,
			                     @RequestParam("numberOfBags") int numberOfBags,
			                     ModelMap model) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(true);
		restClient.updateReservation(request);
		return "confirmReservation";
		
	}

}
