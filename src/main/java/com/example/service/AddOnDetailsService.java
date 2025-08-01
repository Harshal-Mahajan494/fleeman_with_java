package com.example.fleetmanagement.service;

import java.util.List;

import com.example.fleetmanagement.dto.AddOnDetailsDTO;

public interface AddOnDetailsService {
	
	AddOnDetailsDTO createAddOn(AddOnDetailsDTO dto);
	
	List<AddOnDetailsDTO> getAllAddOns();
	
	AddOnDetailsDTO getAddOnById(Short id);
	
	void deleteAddOnById(Short id);

}
