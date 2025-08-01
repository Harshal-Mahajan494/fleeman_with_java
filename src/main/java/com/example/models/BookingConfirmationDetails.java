package com.example.models;
import jakarta.persistence.*;

@Entity
@Table(name="Booking_Confirmation_Details")
public class BookingConfirmationDetails {
	
	@Id
	private Long bookingId;
	private Short carId;

	/*Getter-Setters*/
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Short getCarId() {
		return carId;
	}

	public void setCarId(Short carId) {
		this.carId = carId;
	}

}
