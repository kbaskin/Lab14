package co.grandcircus;

//create an abstract class named Player that stores a name
//this class should include an abstract method named generateRoshambo() that allows an inheriting class to generate and return a Roshambo value

public abstract class Player {

	// abstract String getName();

	private String name;


	public abstract Roshambo generateRoshambo(); // return type is Roshambo

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Roshambo generateRoshambo() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
