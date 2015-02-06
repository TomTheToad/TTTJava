package autos;

public class Automobile {
	
	TellBehavior tellBehavior;
	
	public void drive() {
		System.out.println("I'm driving!");
	}
	
	public void turn() {
		System.out.println("I'm turning!");
	}
	
	public void display() {
		// do something here
	}

	public void setTellBehavior(TellBehavior tb) {
		tellBehavior = tb;
		
	}

	public TellBehavior getTellBehavior(){
	return tellBehavior;
	}
	
	public void performTell() {
		tellBehavior.Tell();
	}
}
