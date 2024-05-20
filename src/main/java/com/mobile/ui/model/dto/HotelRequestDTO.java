package com.mobile.ui.model.dto;

import java.util.List;

public class HotelRequestDTO {

	private String hotelImage;
	private String hotelName;
	private String hotelCity;
	private double hotelRating;
	private String hotelAddress;
	private List<String> hotelFacility;
	private double roomPrice;
	
	public String getHotelImage() {
		return hotelImage;
	}
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public double getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(double hotelRating) {
		this.hotelRating = hotelRating;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public List<String> getHotelFacility() {
		return hotelFacility;
	}
	public void setHotelFacility(List<String> hotelFacility) {
		this.hotelFacility = hotelFacility;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	public HotelRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelRequestDTO(String hotelImage, String hotelName, String hotelCity, double hotelRating,
			String hotelAddress, List<String> hotelFacility, double roomPrice) {
		super();
		this.hotelImage = hotelImage;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelRating = hotelRating;
		this.hotelAddress = hotelAddress;
		this.hotelFacility = hotelFacility;
		this.roomPrice = roomPrice;
	}
	@Override
	public String toString() {
		return "HotelRequestDTO [hotelImage=" + hotelImage + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelRating=" + hotelRating + ", hotelAddress=" + hotelAddress + ", hotelFacility=" + hotelFacility
				+ ", roomPrice=" + roomPrice + "]";
	}
	
	
	
	
	
	
	
	

}
