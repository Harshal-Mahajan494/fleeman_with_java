package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.AgentDetails;
import com.example.models.LocationDetails;

@Repository
public interface LocationDetailsRepository extends JpaRepository<LocationDetails,Integer> {

	 @Query(value = "SELECT * FROM location_details WHERE location_id = ?1", nativeQuery = true)
	    LocationDetails findByLocationId(int locationId);

	    @Query(value = "SELECT * FROM location_details WHERE city_id = ?1", nativeQuery = true)
	    List<LocationDetails> findByCityId(int cityId);

	    @Query(value = "SELECT * FROM location_details WHERE state_id = ?1", nativeQuery = true)
	    List<LocationDetails> findByStateId(int stateId);

	  
}
