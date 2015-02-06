/* Flight.java
 * Developer: Victor Asselta
 * 
 */


package org.airline.reservations;

public class Flight {

	// Fields
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;

	// Constructor 1
	public Flight() {
		departureCity = "Unknown Departure City";
		arrivalCity = "Unknown Arrival City";
		flightNumber = 100;
	}
	
	// Constructor 2
	public Flight(String departureCity, String arrivalCity, int flightNumber) {
		setDepartureCity(departureCity);
		setArrivalCity(arrivalCity);
		setFlightNumber(flightNumber);
	}

	// Getters and Setters
	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String toString() {
		return("Departure City: " + getDepartureCity()
				+ " Arrival City: " + getArrivalCity()
				+ " Flight Number: " + getFlightNumber()
				);
		
	}

}
