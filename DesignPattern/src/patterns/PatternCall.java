package patterns;

public class PatternCall {

	public static void main(String... args) {
		
		// Call the Singleton pattern
		Singleton single = Singleton.getInstance();
		
		// Use it
		single.anyMethodHere();
		
		// Or even call directly
		Singleton.getInstance().anyMethodHere();
	}
}
