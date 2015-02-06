package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlight() {
		Flight testFlight1 = new Flight();
		assertEquals("Unknown Departure City", testFlight1.getDepartureCity());
		assertEquals("Unknown Arrival City", testFlight1.getArrivalCity());
		assertEquals(100, testFlight1.getFlightNumber());
	}
	
	public void testFlight2() {
		Flight testFlight2 = new Flight("New York", "Denver", 1000);
		assertEquals("New York", testFlight2.getDepartureCity());
		assertEquals("Denver", testFlight2.getArrivalCity());
		assertEquals(1000, testFlight2.getFlightNumber());
	}
	
	@Test
	public void testSetDepartureCity() {
		Flight testFlight3 = new Flight();
		testFlight3.setDepartureCity("Los Angeles");
		assertEquals("Los Angeles", testFlight3.getDepartureCity());
	}
	
	@Test
	public void testSetArrivalCity() {
		Flight testFlight4 = new Flight();
		testFlight4.setArrivalCity("New York");
		assertEquals("New York", testFlight4.getArrivalCity());
	}
	
	@Test
	public void testSetFlightNumber() {
		Flight testFlight5 = new Flight();
		testFlight5.setFlightNumber(1000);
		assertEquals(1000, testFlight5.getFlightNumber());
		
	}
	
	@Test
	public void testToString() {
		Flight testFlight6 = new Flight("New York", "Denver", 1000);
		assertEquals("Departure City: New York Arrival City: Denver Flight Number: 1000",
				testFlight6.toString());
	}

}
