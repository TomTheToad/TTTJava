package stateCapitalsGuessingGame;

import java.util.Scanner;

public class BuildStateCapitalsGame {

	// Fields
	String state;
	String capital;
	String correctLetterChoice;
	int totalAllowedAttempts = 2;
	int numberOfTries = 0;

	BuildStateCapitalsGame() {

		// Build the states and capitals
		StateAndCapitalNames stateCapitals = new StateAndCapitalNames();

		// Build the questions
		GenerateABCQuestions GQ = new GenerateABCQuestions();

		// Set the answers
		state = GQ.getCorrectState();
		capital = GQ.getCorrectAnswerCapital();
		correctLetterChoice = GQ.getCorrectAnswerLetter();

		// Output question
		System.out.println(GQ.getQuestions());

		// Ask the user for input
		askForInput();
	}

	private void askForInput() {
		Scanner scanner1 = new Scanner(System.in);

		System.out.print("What is the correct capital? (enter A,B,or C): ");
		String userInput = " ";

		while (numberOfTries < totalAllowedAttempts) {
			userInput = scanner1.nextLine();
			userInput = userInput.toUpperCase();
			numberOfTries += 1;

			if (userInput.equals(correctLetterChoice)) {
				System.out.print("Correct!\n");
				break;
			} else if (numberOfTries == totalAllowedAttempts) {
				System.out.println("Oops. The correct answer is "
						+ correctLetterChoice + " The capital of " + state
						+ " is " + capital);
			} else {
				System.out.print("Sorry that is incorrect! Try again: ");
			}

		}

	}

}
