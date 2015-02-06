package autos;

public class Main {
	
	public static void main(String... args) {
		
		Automobile auto1 = new FordTruck();
		auto1.performTell();
		auto1.drive();
		
		Automobile auto2 = new MiniVan();
		auto2.performTell();
		auto2.turn();
		}
}
