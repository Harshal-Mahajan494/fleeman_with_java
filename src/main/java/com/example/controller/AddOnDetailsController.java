package com.example.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.fleetmanagement.dto.AddOnDetailsDTO;
import com.example.fleetmanagement.entity.AddOnDetails;
import com.example.fleetmanagement.repository.AddOnDetailsRepository;

@RestController
@RequestMapping("/api/addons")
public class AddOnDetailsController {
	
	@Autowired
	private AddOnDetailsRepository repo;
	
	@PostMapping
	public ResponseEntity<AddOnDetailsDTO> create(@RequestBody AddOnDetailsDTO dto){
		AddOnDetails entity = new AddOnDetails(dto.getAddOnName(), dto.getAddOnPrice());
		AddOnDetails saved = repo.save(entity);
		return ResponseEntity.ok(new AddOnDetailsDTO(saved.getAddOnId(), saved.getAddOnName(),saved.getAddOnPrice()));
	}
	
	@GetMapping
	public ResponseEntity<List<AddOnDetailsDTO>> getAll(){
		List<AddOnDetailsDTO> dtoList = repo.findAll().stream()
				.map(e-> new AddOnDetailsDTO(e.getAddOnId(), e.getAddOnName(), e.getAddOnPrice()))
				.collect(Collectors.toList());
		return ResponseEntity.ok(dtoList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AddOnDetailsDTO> getById(@PathVariable Short id){
		return repo.findById(id)
				.map(e-> new AddOnDetailsDTO(e.getAddOnId(), e.getAddOnName(), e.getAddOnPrice()))
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Short id){
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}
