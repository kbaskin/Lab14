package co.grandcircus;

//this player should always select rock

public class RockPlayer extends Player {

	private String name = "Nacho";

	public RockPlayer() {

	}

	public RockPlayer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return "Nacho"; // permanently setting the name
	}


	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
	}

//	@Override
//	public String toString() {
//		return "Sonny's choice = " + ;
//	}


}
