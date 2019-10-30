package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String cont = "";

		System.out.println("Let's play Roshambo!\n");
		// prompt player to enter a name
		String name = Validator.getString(scan, "What is your name?\n");

		Player opponent;
		// prompt user to select an opponent
		int choice = Validator.getInt(scan, "\nWho do you want to play against?\n1. Nacho\n2. Sonny", 1, 2);
		// Nacho = rock
		// sonny = random

		if (choice == 1) {
			opponent = new RockPlayer("Nacho");
			System.out.println("\nGame on! " + name + " vs. Nacho");
		} else {
			opponent = new RandomPlayer();
			System.out.println("\nGame on! " + name + " vs. Sonny");
		}

		do {

			String userChoice = Validator.getString(scan, "Choose Rock, Paper, or Scissors");

			HumanPlayer user = new HumanPlayer(name);
			user.setUserChoice(userChoice);

			Roshambo userRo = user.generateRoshambo();
			Roshambo oppoRo = opponent.generateRoshambo();

			System.out.println(name + ": " + userRo);
			System.out.println(opponent.getName() + ": " + oppoRo);
			Player winner = getWinner(opponent, user, userRo, oppoRo);

//			if (winner == null) {
//				System.out.println("Draw.");
//			} else {
//				System.out.println(winner.getName() + " wins!");
//			}

			cont = Validator.getString(scan, "\nWould you like to play again? (y/n)");
			// continue until the user doesn't want to play anymore & validate response
		} while (cont.equalsIgnoreCase("yes") || (cont.equalsIgnoreCase("y")));

		System.out.println("Thanks for playing!");
		// extended challenge, keep track of wins and loses & display at end
//		System.out.println("Yon won: " + " games.");
//		System.out.println(" won: " + " games");
//		System.out.println(" won: " + " games");

		scan.close();

	}

	public static Player getWinner(Player player1, Player player2, Roshambo r1, Roshambo r2) {

		if ((r1.equals("Rock") && r2.equals("Scissors")) || (r1.equals("Scissors") && r2.equals("Paper"))
				|| (r1.equals("Paper") && r2.equals("Rock"))) {
			System.out.println("Winner winner chicken dinner!");
			return player1;
		} else if (r1.equals(r2)) {
			System.out.println("Draw");
			return null;
		} else {
			System.out.println("wahhh wahh, you lose.");
			return player2;
		}

	}

}
