package stateCapitalsGuessingGame;

import java.util.Scanner;

public class RunCapitalsGame {
	public static void main(String... args) {

		// Fields
		String playAgain = "y";
		Scanner scanner1 = new Scanner(System.in);

		while (playAgain.equals("y") || playAgain.equals("yes")) {
			
			System.out.println("");
			BuildStateCapitalsGame BG = new BuildStateCapitalsGame();

			System.out.print("\nWould you like to play again? :");
			try {
				playAgain = scanner1.nextLine();
			} catch (Exception e) {
				System.out.println("Input not recognized");
			}
			
			if(playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("no")) {
				System.out.println("Thanks for playing!");
			}
		}
	}

}
