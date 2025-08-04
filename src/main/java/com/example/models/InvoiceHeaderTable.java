package com.example.models;
import java.sql.Date;
import java.sql.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name="InvoiceHeaderTable")
public class InvoiceHeaderTable {
	
	@Id
	private Integer invoiceId;
	
	private Timestamp invoiceDate;
	
	private Integer bookingId;
	
	private Float rate;
	
	private Date handoverDate;
	
	private Date returnDate;
	
	private Date actualReturnDate;
	
	@Column(length=60)
	private String pickupLocation;
	
	@Column(length=60)
	private String dropLocation;
	
	private Integer userId;
	
	private Short carId;
	
	private Float rentalAmount;

	/*Getter-Setters*/
	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Date getHandoverDate() {
		return handoverDate;
	}

	public void setHandoverDate(Date handoverDate) {
		this.handoverDate = handoverDate;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Short getCarId() {
		return carId;
	}

	public void setCarId(Short carId) {
		this.carId = carId;
	}

	public Float getRentalAmount() {
		return rentalAmount;
	}

	public void setRentalAmount(Float rentalAmount) {
		this.rentalAmount = rentalAmount;
	}

	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

}
