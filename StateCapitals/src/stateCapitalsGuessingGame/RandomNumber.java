/*
 * 
 * Generates a random double
 * 
 */

package stateCapitalsGuessingGame;

import java.util.Random;

public class RandomNumber {

	private int randomNumber;

	public int getRandomNumber(int number) {
		Random genRanNumber = new Random();
		randomNumber = genRanNumber.nextInt(number);
		return randomNumber;
	}

}
