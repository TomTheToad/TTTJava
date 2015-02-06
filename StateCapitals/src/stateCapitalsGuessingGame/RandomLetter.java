/*
 * 
 * Generates a random letter of either A, B, or C
 * 
 */

package stateCapitalsGuessingGame;

import java.util.Random;

public class RandomLetter {

	// Fields
	private int randomNumber;
	private String randomLetter;
	private String[] alphabet = { "A", "B", "C"};

	public String getRandomLetter() {
		Random genRandNumber = new Random();
		randomNumber = genRandNumber.nextInt(3);

		randomLetter = alphabet[randomNumber];
		
		return randomLetter;

	}
}
