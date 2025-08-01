package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.LocationDetails;
import com.example.repository.LocationDetailsRepository;

@Service
public class LocationDetailsServiceImpl implements LocationDetailsService {

	@Autowired
	private LocationDetailsRepository repository;
	
	
	@Override
	public List<LocationDetails> getAllLocations() {
	return repository.findAll();
	}

	@Override
	public LocationDetails getById(int id) {
		return repository.findByLocationId(id);
	}

	@Override
	public List<LocationDetails> getByCityId(int cityId) {
	    return repository.findByCityId(cityId);
	}

	@Override
	public List<LocationDetails> getByStateId(int stateId) {
	    return repository.findByStateId(stateId);
	}

}
