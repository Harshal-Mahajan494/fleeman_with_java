package com.example.service;

import java.util.List;

import com.example.models.LocationDetails;

public interface LocationDetailsService {
	
	 List<LocationDetails> getAllLocations();
	    LocationDetails getById(int id);
		List<LocationDetails> getByCityId(int cityId);
		List<LocationDetails> getByStateId(int stateId);
	   
}
