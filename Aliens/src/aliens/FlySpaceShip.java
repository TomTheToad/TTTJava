package aliens;

public class FlySpaceShip implements UniqueBehavior {

	@Override
	public void behavior() {
		System.out.println("Launching Flying Space Ship!!");

	}

	@Override
	public String behaviorToString() {
		String returnString = "I fly a space ship!!";
		return returnString;
	}

}
