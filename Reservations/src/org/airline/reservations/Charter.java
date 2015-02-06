package org.airline.reservations;

import java.time.LocalDateTime;

public class Charter extends Flight {

	// Fields
	private LocalDateTime departureDateTime;

	// Constructor
	public Charter(String departureCity, String arrivalCity, int flightNumber,
			String departureDateTime) {
		super(departureCity, arrivalCity, flightNumber);
		setDepartureDateTime(departureDateTime);
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = LocalDateTime.parse(departureDateTime);
	}

	public String toString() {
		return ("Departure City: " + this.getDepartureCity()
				+ " Arrival City: " + this.getArrivalCity()
				+ " Flight Number: " + this.getFlightNumber()
				+ " Depature Time: " + this.getDepartureDateTime());
	}

}
