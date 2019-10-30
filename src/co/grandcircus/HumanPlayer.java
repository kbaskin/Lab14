package co.grandcircus;

//create a third player class that extends Player and implements the generateRoshambo() method
//for this class, generateRoshambo() gets input from the human player and returns the value chosen

public class HumanPlayer extends Player {


	public HumanPlayer() {
	}

	public HumanPlayer(String name) {
		super(name);
	}

	private String userChoice;

	public void setUserChoice(String input) {
		userChoice = input;
	}

	public String getUserChoice() {
		return userChoice;
	}

	@Override
	public Roshambo generateRoshambo() {
		if (userChoice.equalsIgnoreCase("rock")) { // (input.toLowerCase().startsWith("r"))
			return Roshambo.Rock;
		} else if (userChoice.equalsIgnoreCase("paper")) {
			return Roshambo.Paper;
		} else { // (input.equalsIgnoreCase("scissors"))
			return Roshambo.Scissors;
		}
	}

	public String toString() {
		return "Player choice = " + userChoice;
	}


//	public void setUserChoice(String input2) {
//		// TODO Auto-generated method stub
//
//	}

//	public Roshambo generateRoshambo(String input) {
//		if (input.equalsIgnoreCase("rock")) {
//			return Roshambo.Rock;
//		} else if (input.equalsIgnoreCase("paper")) {
//			return Roshambo.Paper;
//		} else { // (input.equalsIgnoreCase("scissors"))
//			return Roshambo.Scissors;
//		}
//	}

}

