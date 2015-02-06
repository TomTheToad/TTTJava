/*
 * Class that creates a TreeMap with a numerical key and state in alphabetical order.
 */

package stateCapitalsGuessingGame;

import java.util.TreeMap;

public class StateAndCapitalNames {

	// Fields
	private String[][] StatesAndCapitals = { { "Alabama", "Montgomery" },
			{ "Alaska", "Juneau" }, { "Arizon", "Phoenix" },
			{ "Arkansas", "Little Rock" }, { "California", "Sacremento" },
			{ "Colorado", "Denver" }, { "Connecticut", "Hartford" },
			{ "Delaware", "Dover" }, { "Florida", "Tallahassee" },
			{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" },
			{ "Idaho", "Boise" }, { "Illinois", "Springfield" },
			{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" },
			{ "Kansas", "Topeka" }, { "Kentucky", "Frankfort" },
			{ "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
			{ "Maryland", "Annapolis" }, { "Massachusetts", "Boston" },
			{ "Michigan", "Lansing" }, { "Minnesota", "Saint Paul" },
			{ "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
			{ "Montana", "Helena" }, { "Nebraska", "Lincoln" },
			{ "Nevada", "Carson City" }, { "New Hampshire", "Concord" },
			{ "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
			{ "New York", "Albany" }, { "North Carolina", "Raleigh" },
			{ "North Dakota", "Bismark" }, { "Ohio", "Columbus" },
			{ "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
			{ "Pennsylvania", "Harrisburg" }, { "Rhoda Island", "Providence" },
			{ "South Carolina", "Columbia" }, { "South Dakota", "Pierre" },
			{ "Tennessee", "Nashville" }, { "Texas", "Austin" },
			{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" },
			{ "Virginia", "Richmond" }, { "Washington", "Olympia" },
			{ "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
			{ "Wyoming", "Cheyenne" } };

	public String getStateNames() {
		StringBuilder sb1 = new StringBuilder(
				"The States and Capitals are as follows:\n");

		for (int i = 0; i < StatesAndCapitals.length; i++) {
			sb1.append(" " + StatesAndCapitals[i][0] + "\n");
		}

		String returnStates = sb1.toString();
		return returnStates;
	}

	public String getRandomState() {
		RandomNumber randomNumber = new RandomNumber();
		int stateNumber = randomNumber.getRandomNumber(50);
		String stateToReturn = StatesAndCapitals[stateNumber][0];
		return stateToReturn;
	}

	public String getRandomCapital() {
		RandomNumber randomNumber = new RandomNumber();
		int stateNumber = randomNumber.getRandomNumber(50);
		String capitalToReturn = StatesAndCapitals[stateNumber][1];
		return capitalToReturn;
	}

	public String[][] getRandomStateAndCapital() {
		RandomNumber randomNumber = new RandomNumber();
		int stateNumber = randomNumber.getRandomNumber(50);

		String[][] stateAndCapitalToReturn = {
				{ StatesAndCapitals[stateNumber][0] },
				{ StatesAndCapitals[stateNumber][1] } };

		/*
		 * For testing purposes
		 * System.out.println(stateAndCapitalToReturn[0][0]);
		 * System.out.println(stateAndCapitalToReturn[1][0]);
		 */
		return stateAndCapitalToReturn;
	}

	public String toString() {
		StringBuilder sb2 = new StringBuilder(
				"The States and Capitals are as follows:\n");

		for (int i = 0; i < StatesAndCapitals.length; i++) {
			sb2.append("The Capital of " + StatesAndCapitals[i][0] + " is "
					+ StatesAndCapitals[i][1] + ".\n");
		}

		String returnStatesAndCapitals = sb2.toString();
		return returnStatesAndCapitals;

	}
}
