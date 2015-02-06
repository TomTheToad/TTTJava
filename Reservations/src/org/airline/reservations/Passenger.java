package org.airline.reservations;

public class Passenger {
	
	// fields
	private String name; // field for passenger name
	
	// Constructor 1
	public Passenger() {
		name = "Unknown Name";
	}
	
	// Constructor 2
	public Passenger(String name) {
		setName(name);
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		name = newName;
	}
	
	// toString
	public String toString() {
		return "Passenger: " + this.getName();
		
	}
}
