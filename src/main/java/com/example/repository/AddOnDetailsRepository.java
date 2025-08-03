package com.example.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fleetmanagement.entity.AddOnDetails;

public interface AddOnDetailsRepository extends JpaRepository<AddOnDetails, Short> {
	
	/*
	 * Optional<T> is:
	 * A container that may or may not contain a non-null value.
	 * A safe and clean way to handle possibly missing data.
	 */
	Optional<AddOnDetails> findByAddOnName(String addOnName);
	
	boolean existsByAddOnName(String addOnName);

}
