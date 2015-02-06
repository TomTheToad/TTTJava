package org.airline.reservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Console {

	public static void main(String... args) {
		// Initialize database
		Database prodDB = new Database();
		prodDB.bootstrap();
		prodDB.setLogging();
		
		// Fields
		String passengerName = null;
		int flightNumber = 0;
		LocalDate departureDate = LocalDate.now();
		int seatNumber = 0;

		// Initialize console
		boolean always = true;
		BufferedReader screenInput = new BufferedReader(new InputStreamReader(
				System.in));

		while (always) {

			// ask for passengerName and add
			System.out.println("Enter Passenger: ");

			try {
				passengerName = screenInput.readLine();
			} catch (IOException e) {
				System.out.println("Sorry, I don't understand.");
			}

			boolean result = prodDB.addPassenger(passengerName);
			if (result) {
				System.out.println("Welcome back " + passengerName);
			} else {
				System.out.println("Welcome " + passengerName);
			}

			// show flights and ask for flight
			System.out.println("\nHere are the available flights: ");
			for (Flight item : prodDB.getFlights()) {
				System.out.println(item);
			}

			System.out.println("Enter the flight number to book: ");

			try {
				// Integer.parseInt converts String input to an integer.
				flightNumber = Integer.parseInt(screenInput.readLine());
			} catch (NumberFormatException e) {
				Logger.getGlobal().warning("Flight must be an integer.");
			} catch (IOException e) {
				System.out.println("Please enter a flight number.");
				e.printStackTrace();
			}

			// show available seats and ask
			System.out.println("\nAssuming that you are flying today,");
			System.out.println("Here are the available seats on that flight: ");

			ArrayList<Seat> openSeats = prodDB.getOpenSeats(departureDate,
					flightNumber);

			for (Seat item : openSeats) {
				System.out.println(item.getSeatNumber() + ", ");
			}
			System.out.println("\nEnter the seat you want: ");
			try {
				seatNumber = Integer.parseInt(screenInput.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Sorry, that is not a valid seat number.");
			} catch (IOException e) {
				System.out.println("Please enter a seat number.");
			}
		

		// create ticket and return info
		String ticketInfo = prodDB.addTicket(departureDate, passengerName, flightNumber, seatNumber);
		System.out.println("\nReservation was Successful. Here are your details:");
		System.out.println(ticketInfo + "\n");

		// repeat
		}
	}
}
