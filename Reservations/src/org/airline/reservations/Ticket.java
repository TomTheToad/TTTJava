package org.airline.reservations;

import java.time.LocalDate;

public class Ticket {
	
	// Fields
	private LocalDate departureDate;
	private Passenger passenger;
	private Flight flight;
	private Seat seat;
	
	// Constructor
	public Ticket() {
		departureDate = LocalDate.now();
	}
	
	// Getters and Setters
	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	public String toString() {
		return("Ticket Departure Date: "  + getDepartureDate() 
				+ " Passenger: " + getPassenger().getName() 
				+ " Flight: " + getFlight().getFlightNumber()
				+ " Seat: " + getSeat().getSeatNumber()
				);
	}
	

}
