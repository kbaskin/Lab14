package co.grandcircus;

//create an enumeration called Roshambo that stores 3 values, rock, paper, and scissors
//this enum should include a toString method that can convert the selected value to a String

public enum Roshambo {

	Rock, Paper, Scissors;

	@Override
	public String toString() {
		switch (this) {
		case Rock:
			return "rock";
		case Paper:
			return "paper";
		default:
			return "scissors";
		}
	}

}
