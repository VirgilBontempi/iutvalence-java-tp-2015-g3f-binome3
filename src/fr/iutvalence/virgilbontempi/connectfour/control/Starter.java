package fr.iutvalence.virgilbontempi.connectfour.control;

import fr.iutvalence.virgilbontempi.connectfour.Model.Game;

/**
 * @author bontempv
 *
 *Start the game (by the way of Game).
 */
public class Starter {
	/**
	 * The main class.
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game("Player 1", "Player 2");
		game.start();
	}
}
