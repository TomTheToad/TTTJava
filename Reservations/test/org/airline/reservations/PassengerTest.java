package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
		Passenger testPassenger1 = new Passenger();
		String result = testPassenger1.getName();
		assertEquals("Unknown Name", result);
	}
	@Test
	public void testPassenger2() {
		Passenger testPassenger2 = new Passenger("Richard Nixon");
		String result = testPassenger2.getName();
		assertEquals("Richard Nixon", result);
	}

	@Test
	public void testSetName() {
		Passenger testPassenger3 = new Passenger();
		testPassenger3.setName("Victor");
		assertEquals("Victor", testPassenger3.getName());
	}
	
	@Test
	public void testToString() {
		Passenger testPassenger4 = new Passenger("Helen of Troy");
		assertEquals("Passenger: Helen of Troy", testPassenger4.toString());
	}

}
