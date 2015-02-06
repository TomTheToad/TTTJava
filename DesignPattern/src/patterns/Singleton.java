package patterns;

public class Singleton {
	
	// 2) Create a static variable to hold the one instance of this object
	// you want to create
	private static Singleton __me = null;
	
	// 1) private Constructor prevents instantiation.
	private Singleton() {
	}

	// 3) ask for the single object
	public static Singleton getInstance() {
		// do I exist already?
		if(__me == null) {
			// if not, instantiate and store
			__me = new Singleton();
			System.out.println("Single Object Created.");
		}
		System.out.println("Single Object Exists Already.");
		return __me;
	}
	
	
	public void anyMethodHere() {
		// Place Holder method for example.
		System.out.println("Just some text");
	}

}
