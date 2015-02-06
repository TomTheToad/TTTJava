package aliens;

public class Dance implements UniqueBehavior {

	@Override
	public void behavior() {
		System.out.println("Doing a little jig!!");

	}

	@Override
	public String behaviorToString() {
		String returnString = "I do a dance!!";
		return returnString;
	}

}
