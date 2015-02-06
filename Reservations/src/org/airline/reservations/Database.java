// Database.java
package org.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

	// Fields
	private ArrayList<Seat> seats;
	private ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;
	
	// Logger
	private static Logger databaseLog = Logger.getLogger(Database.class.getName());
	private static ConsoleHandler logScreen = new ConsoleHandler();

	// Constructor
	public Database() {
		seats = new ArrayList<Seat>();
		flights = new ArrayList<Flight>();
		passengers = new ArrayList<Passenger>();
		tickets = new ArrayList<Ticket>();
	}

	// Getters
	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	
	// Setters
	public void setLogging() {
		databaseLog.addHandler(logScreen);
		databaseLog.setLevel(Level.FINE);
		logScreen.setLevel(Level.FINE);
		databaseLog.setUseParentHandlers(false);
	}
	
	public void addSeat(int seatNumber) {
		seats.add(new Seat(seatNumber));
		
	}

	public void addFlight(String departureCity, String arrivalCity,int flightNumber) {
		flights.add(new Flight(departureCity, arrivalCity, flightNumber));
		
	}

	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;
		
		for(Passenger item : getPassengers()){
			if(passengerName.equals(item.getName())){
				passengerExists = true;
			}
		}
		if(passengerExists == false) {
			passengers.add(new Passenger(passengerName));
		}
		return passengerExists;
	}
	
	public String addTicket(LocalDate departureDate, String passengerName, int flightNumber, int seatNumber) {
		
		// Find the passenger object
		Passenger ticketPassenger = null;
		for(Passenger item : getPassengers()) {
			if(passengerName.equals(item.getName()))  {
				ticketPassenger = item;
			}
		}
		
		// Find flight object
		Flight ticketFlight = null;
		for(Flight item : getFlights())	{
			if(flightNumber == item.getFlightNumber()) {
				ticketFlight = item;
			}
		}
		
		// Find seat object
		Seat ticketSeat = null;
		for(Seat item : getSeats()){
			if(seatNumber == item.getSeatNumber()) {
				ticketSeat = item;
			}
		}
		
		// Temporary Ticket tempTicket
		Ticket tempTicket = new Ticket();
		tempTicket.setDepartureDate(departureDate);
		tempTicket.setPassenger(ticketPassenger);
		tempTicket.setFlight(ticketFlight);
		tempTicket.setSeat(ticketSeat);
		tickets.add(tempTicket);
		databaseLog.info("Ticket Created.");
		return tempTicket.toString();
	}
	
	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, int flightNumber) {
		ArrayList<Seat> openSeats = getSeats();
		
		for(Ticket item : getTickets()) {
			if (departureDate.equals(item.getDepartureDate()) && flightNumber == item.getFlight().getFlightNumber()) {
				openSeats.remove(item.getSeat());
			}
		}
		return openSeats;
	}
	
	// Populate Array List in Database class
	public void bootstrap() {
		for(int i = 1; i<=6; i++) {
		addSeat(i);
		}
		
		addFlight("Las Angeles", "Chicago", 1000);
		addFlight("Chicago", "New York", 1010);
		addFlight("New York", "Chicago", 2000);
		addFlight("Chicago", "Las Angeles", 2010);
	}

}
