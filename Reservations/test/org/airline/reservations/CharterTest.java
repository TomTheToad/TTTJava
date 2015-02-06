package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharterTest {

	@Test
	public void testCharter() {
		Charter charter1 = new Charter("San Diego", "San Francisco", 6010,
				"2014-06-15T09:30");
		assertEquals(6010, charter1.getFlightNumber());
		assertEquals("2014-06-15T09:30", charter1.getDepartureDateTime()
				.toString());
	}

	@Test
	public void testCharterToString() {
		Charter testCharter1 = new Charter("New York", "Denver", 6010,
				"2014-06-15T09:30");
		assertEquals(
				"Departure City: New York Arrival City: Denver Flight Number: 6010 Depature Time: 2014-06-15T09:30",
				testCharter1.toString());
	}

}
