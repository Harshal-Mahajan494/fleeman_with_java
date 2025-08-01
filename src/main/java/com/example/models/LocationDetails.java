package com.example.models;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Location_Details")
public class LocationDetails {

	private int Location_Id;
	private String Location_Name;
	private String Address;
	private CityDetails city;
	private StateDetails state;
	
	
	
	@ManyToOne
	@JoinColumn(name = "City_Id",foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	public CityDetails getCity() {
		return city;
	}
	public void setCity(CityDetails city) {
		this.city = city;
	}
	
	@ManyToOne
	@JoinColumn(name = "State_Id",foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	public StateDetails getState() {
		return state;
	}
	public void setState(StateDetails state) {
		this.state = state;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getLocation_Id() {
		return Location_Id;
	}
	public void setLocation_Id(int location_Id) {
		Location_Id = location_Id;
	}
	public String getLocation_Name() {
		return Location_Name;
	}
	public void setLocation_Name(String location_Name) {
		Location_Name = location_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
