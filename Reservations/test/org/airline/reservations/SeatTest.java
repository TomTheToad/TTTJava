package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat testSeat1 = new Seat();
		assertEquals(-1, testSeat1.getSeatNumber());
	}
	
	@Test
	public void testSeat2() {
		Seat testSeat2 = new Seat(50);
		assertEquals(50, testSeat2.getSeatNumber());
	}
	
	@Test
	public void testGetSeat() {
		Seat testSeat3 = new Seat();
		testSeat3.setSeatNumber(60);
		assertEquals(60, testSeat3.getSeatNumber());
	}
	
	@Test
	public void testSetSeat() {
		Seat testSeat4 = new Seat();
		testSeat4.setSeatNumber(2);
		assertEquals(2, testSeat4.getSeatNumber());
	}
	
	@Test
	public void testToString() {
		Seat testSeat5 = new Seat(70);
		assertEquals("Seat Number: 70", testSeat5.toString());
	}

}
