package stateCapitalsGuessingGame;

public class GenerateABCQuestions {

	// Fields
	private String askQuestion = "What is the capital city of ";
	private String[] choices = { " ", " ", " " };
	private String correctAnswerLetter;
	private String correctState;
	private String correctAnswerCapital;
	private String answerOptions;

	GenerateABCQuestions() {
		GenerateCorrectStateAndCapital();
		SetAnswerChoicesArray();
		GenerateQuestions();

	}

	private void GenerateCorrectStateAndCapital() {
		StateAndCapitalNames SCNames = new StateAndCapitalNames();
		String[][] getBackNames = SCNames.getRandomStateAndCapital();

		/*
		 * For testing purposes System.out.println(getBackNames[0][0]);
		 * System.out.println(getBackNames[1][0]);
		 */

		correctState = getBackNames[0][0];
		correctAnswerCapital = getBackNames[1][0];

	}

	private void SetAnswerChoicesArray() {
		choices[0] = correctAnswerCapital;

		StateAndCapitalNames capitalName = new StateAndCapitalNames();

		while (choices[1].equals(" ")
				|| choices[1].equals(correctAnswerCapital)) {
			choices[1] = capitalName.getRandomCapital();
		}

		while (choices[2].equals(" ")
				|| choices[2].equals(correctAnswerCapital)
				|| choices[2].equals(choices[1])) {
			choices[2] = capitalName.getRandomCapital();
		}
	}

	private void GenerateQuestions() {
		RandomNumber randomNumber = new RandomNumber();

		int multipleChoice1 = randomNumber.getRandomNumber(3);
		int multipleChoice2 = randomNumber.getRandomNumber(3);
		int multipleChoice3 = randomNumber.getRandomNumber(3);

		while (multipleChoice2 == multipleChoice1) {
			multipleChoice2 = randomNumber.getRandomNumber(3);
		}

		while (multipleChoice3 == multipleChoice1
				|| multipleChoice3 == multipleChoice2) {
			multipleChoice3 = randomNumber.getRandomNumber(3);
		}

		answerOptions = "A) " + choices[multipleChoice1] + "\nB) "
				+ choices[multipleChoice2] + "\nC) " + choices[multipleChoice3];

		SetCorrectAnswerLetter(multipleChoice1, multipleChoice2,
				multipleChoice3);

	}

	private void SetCorrectAnswerLetter(int optionA, int optionB, int optionC) {
		if (optionA == 0) {
			correctAnswerLetter = "A";
		} else if (optionB == 0) {
			correctAnswerLetter = "B";
		} else {
			correctAnswerLetter = "C";
		}
	}

	public String getCorrectState() {
		return correctState;
	}

	public String getCorrectAnswerCapital() {
		return correctAnswerCapital;
	}

	public String getCorrectAnswerLetter() {
		return correctAnswerLetter;
	}

	public String getQuestions() {
		StringBuilder sb = new StringBuilder(askQuestion);
		sb.append(correctState + "\n");
		sb.append(answerOptions);
		String returnString = sb.toString();
		return returnString;
	}

}
