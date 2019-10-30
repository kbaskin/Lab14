package co.grandcircus;

//this player should randomly select rock, paper, or scissors
//random class or Math.random

public class RandomPlayer extends Player {

	public String name = "Sonny";

	public RandomPlayer() {
		super();
	}

	public RandomPlayer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return "Sonny"; // permanently setting the name
	}


	public Roshambo generateRoshambo() {

		int i = (int) (Math.random() * 3) + 1;

//		Random generator = new Random();
//		int compNumber = (generator.nextInt(3));
//		String compChoice = "";

		switch (i) {

		case 1:
			return Roshambo.Rock;
		case 2:
			return Roshambo.Paper;
		default:
			return Roshambo.Scissors;
		}
	}



}
