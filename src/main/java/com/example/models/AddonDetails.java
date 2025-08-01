package com.example.models;
import jakarta.persistence.*;
@Entity
@Table(name="Add_on_Details")
public class AddonDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short addonId;
	
	@Column(length=60, unique= true)
	private String addonName;
	
	private Float addonPrice;

	/*Getter-Setters*/
	public Short getAddonId() {
		return addonId;
	}

	public void setAddonId(Short addonId) {
		this.addonId = addonId;
	}

	public String getAddonName() {
		return addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
	}

	public Float getAddonPrice() {
		return addonPrice;
	}

	public void setAddonPrice(Float addonPrice) {
		this.addonPrice = addonPrice;
	}

}
