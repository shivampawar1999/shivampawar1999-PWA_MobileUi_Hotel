package com.mobile.ui.model;

import java.time.LocalDate;


public class HotelSearch {

	private String destination;

	private LocalDate fromDate;

	private LocalDate toDate;
	private int selectedTraveler;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public int getSelectedTraveler() {
		return selectedTraveler;
	}

	public void setSelectedTraveler(int selectedTraveler) {
		this.selectedTraveler = selectedTraveler;
	}

	public HotelSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelSearch(String destination, LocalDate fromDate, LocalDate toDate, int selectedTraveler) {
		super();
		this.destination = destination;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.selectedTraveler = selectedTraveler;
	}

	@Override
	public String toString() {
		return "HotelSearch [destination=" + destination + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", selectedTraveler=" + selectedTraveler + "]";
	}

}
