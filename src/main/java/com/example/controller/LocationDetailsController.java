package com.example.controller;

import com.example.models.LocationDetails;
import com.example.service.LocationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationDetailsController {

    @Autowired
    private LocationDetailsService locationService;

    
    @GetMapping
    public List<LocationDetails> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocationDetails> getLocationById(@PathVariable int id) {
        LocationDetails location = locationService.getById(id);
        if (location != null) {
            return ResponseEntity.ok(location);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/by-city")
    public ResponseEntity<List<LocationDetails>> getLocationsByCityId(@RequestParam int cityId) {
        List<LocationDetails> locations = locationService.getByCityId(cityId);
        return ResponseEntity.ok(locations);
    }

    @GetMapping("/by-state")
    public ResponseEntity<List<LocationDetails>> getLocationsByStateId(@RequestParam int stateId) {
        List<LocationDetails> locations = locationService.getByStateId(stateId);
        return ResponseEntity.ok(locations);
    }
}