package com.example.service;

import java.util.List;

import com.example.models.AirportDetails;

public interface AirportDetailsService {
	
	 List<AirportDetails> getAllAirports();
	    AirportDetails getById(int id);
	    void deleteAirport(int id);
}
