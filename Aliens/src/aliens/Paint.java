package aliens;

public class Paint implements UniqueBehavior {

	@Override
	public void behavior() {
		System.out.println("Painting a masterpiece!!");

	}

	@Override
	public String behaviorToString() {
		String returnString = "I make a painting!";
		return returnString;
	}

}
