package aliens;

public class MainMakeAliens {
	public static void main(String[] args) {
		Alien alien1 = new Promethians();
		System.out.println(alien1.toString());
		alien1.peformUniqueBehavior();
		
		System.out.println("");
		
		Alien alien2 = new Zaragosan();
		System.out.println(alien2.toString());
		alien2.peformUniqueBehavior();
	}

}
