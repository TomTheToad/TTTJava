package stateCapitalsGuessingGame;

public class TestGenerateABCQuestions {
	
	TestGenerateABCQuestions() {
	GenerateABCQuestions GQ = new GenerateABCQuestions();
	
	System.out.println(GQ.getQuestions());
	
	System.out.println("The randomly chosen state name is: " + GQ.getCorrectState());
	System.out.println("The correct capital is: " + GQ.getCorrectAnswerCapital());
	System.out.println("The correct letter choice is: " + GQ.getCorrectAnswerLetter());
	System.out.println("The Questions are as follows: \n" + GQ.getQuestions());
	
	}

}
