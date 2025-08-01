package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.AirportDetails;
import com.example.repository.AirportDetailsRepository;
@Service
public class AirportDetailsServiceImpl implements AirportDetailsService {

	@Autowired
	private AirportDetailsRepository repository;
	@Override
	public List<AirportDetails> getAllAirports() {
		 return repository.findAll();
	}

	@Override
	public AirportDetails getById(int id) {
		return repository.findByAirportId(id);
	}

	@Override
	public void deleteAirport(int id) {
		 repository.deleteByAirportId(id);
		
	}

}
