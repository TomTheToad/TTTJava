package autos;

public class FordTruck extends Automobile {

	FordTruck() {
	tellBehavior = new TellColor();
	
	}
	
	public void Tell(){
		System.out.println("I'm a blue Ford truck.");
	}
		
}
