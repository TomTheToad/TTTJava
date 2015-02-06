/*
 * Seat.java
 * Developer: Victor Asselta
 */
package org.airline.reservations;

public class Seat {

	// Fields
	private int seatNumber;

	// Constructor 1
	public Seat() {
		seatNumber = -1;
	}
	
	// Constructor 2
	public Seat(int seatNumber) {
		setSeatNumber(seatNumber);
	}

	// Getters and Setters
	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public String toString() {
		return("Seat Number: " + getSeatNumber());
	}

}
