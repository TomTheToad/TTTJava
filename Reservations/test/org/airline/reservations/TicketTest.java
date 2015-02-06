package org.airline.reservations;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TicketTest {
	
	@Test
	public void testGetDepartureDate() {
		Ticket testTicket1 = new Ticket();
		assertEquals(LocalDate.now(), testTicket1.getDepartureDate());
	}
	
	@Test
	public void testSetDepartureDate() {
		Ticket testTicket2 = new Ticket();
		testTicket2.setDepartureDate(LocalDate.now());
		assertEquals(LocalDate.now(), testTicket2.getDepartureDate());
	}
	
	@Test
	public void testGetPassenger() {
		Ticket testTicket3 = new Ticket();
		Passenger testPassenger1 = new Passenger("John Appleseed");
		testTicket3.setPassenger(testPassenger1);
		assertEquals("John Appleseed", testTicket3.getPassenger().getName());
	}

	@Test
	public void testSetPassenger() {
		Ticket testTicket4 = new Ticket();
		Passenger testPassenger2 = new Passenger("Victor");
		testTicket4.setPassenger(testPassenger2);
		assertEquals("Victor", testTicket4.getPassenger().getName());
	}
	
	@Test
	public void testGetFlight() {
		Ticket testTicket5 = new Ticket();
		Flight testFlight1 = new Flight();
		testFlight1.setFlightNumber(1000);
		testTicket5.setFlight(testFlight1);
		assertEquals(1000, testTicket5.getFlight().getFlightNumber());
	}
	
	@Test
	public void testSetFlight() {
		Ticket testTicket6 = new Ticket();
		Flight testFlight2 = new Flight();
		testFlight2.setFlightNumber(2000);
		testTicket6.setFlight(testFlight2);
		assertEquals(2000, testTicket6.getFlight().getFlightNumber());
	}
	
	@Test
	public void testGetSeat() {
		Ticket testTicket7 = new Ticket();
		Seat testSeat1 = new Seat(10);
		testTicket7.setSeat(testSeat1);
		assertEquals(10, testTicket7.getSeat().getSeatNumber());
	}
	
	@Test
	public void testSetSeat() {
		Ticket testTicket8 = new Ticket();
		Seat testSeat2 = new Seat(20);
		testTicket8.setSeat(testSeat2);
		assertEquals(20, testTicket8.getSeat().getSeatNumber());
	}
	
	@Test
	public void testToString() {
		Ticket testTicket9 = new Ticket();
		
		// set testDate
		LocalDate testDate = testTicket9.getDepartureDate();
		
		// create testPassenger3
		Passenger testPassenger3 = new Passenger("Jolly Roger");
		testTicket9.setPassenger(testPassenger3);
		
		// create testFlight3
		Flight testFlight3 = new Flight();
		testFlight3.setFlightNumber(3000);
		testTicket9.setFlight(testFlight3);
		
		// create testSeat3
		Seat testSeat3 = new Seat(30);
		testTicket9.setSeat(testSeat3);
		
		// test the toString with above date
		assertEquals("Ticket Departure Date: " + testDate + " Passenger: Jolly Roger Flight: 3000 Seat: 30",
				testTicket9.toString());
	}

}
