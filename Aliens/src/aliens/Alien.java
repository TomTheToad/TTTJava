package aliens;

public class Alien {
	
	// Fields
	String raceName = "unknown";
	String skinColor = "green";
	String language = "unknown";
	UniqueBehavior uniqueBehavior;
	
	// Skin Color
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	
	// Language
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
		
	// Unique Behavior	
	}
	public UniqueBehavior getUniqueBehavior() {
		return uniqueBehavior;
	}
	public void setUniqueBehavior(UniqueBehavior uniqueBehavior) {
		this.uniqueBehavior = uniqueBehavior;
	}
	public void peformUniqueBehavior() {
		uniqueBehavior.behavior();
	}
	
	// ToString
	public String toString() {
		StringBuilder sb = new StringBuilder("I am an alien! ");
		sb.append("My race is called " + raceName + ". ");
		sb.append("My skinColor is " + skinColor + ". ");
		sb.append("My unique behavior is " + uniqueBehavior.behaviorToString());
		String returnString = sb.toString();
		return returnString;
	}
	
	
	
}

