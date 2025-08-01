package com.example.models;

import java.sql.Date;
import java.sql.Timestamp;
import jakarta.persistence.*;
enum RateType{
	DAILY,WEEKLY,MONTHLY
}
@Entity
@Table(name="Booking_Details")
public class BookingDetails {
	
	@Id
	private Integer bookingId;
	
	@Column(length=60)
	@JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))

	private String userId;	//Foreign key
	
	private Timestamp bookingDate;
	
	@Column(length=60)
	@JoinColumn(name = "vehicle_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private String vehicleId;		//Foreign key
	
	private Float rate;
	
	@Enumerated(EnumType.STRING)
	private RateType rateType; 
	
	private Date pickupDate;
	
	private Date returnDate;
	
	@Column(length=60)
	private String pickupLocation;
	
	@Column(length=60)
	private String dropLocation;

	/*Getter-Setters*/
	
	public Integer getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}
	
	public RateType getRateType() {
		return rateType;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}	

}

