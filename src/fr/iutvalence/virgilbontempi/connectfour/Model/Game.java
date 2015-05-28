package fr.iutvalence.virgilbontempi.connectfour.Model;

import java.util.Objects;
import java.util.Scanner;

import fr.iutvalence.virgilbontempi.connectfour.exceptions.FullColumnException;
import fr.iutvalence.virgilbontempi.connectfour.exceptions.OutOfRangeException;

/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game {
	/** Attribute named "player1" type "Player". */
	private final Player player1;

	/**
	 * Player player1's getter.
	 * 
	 * @return Player player1
	 */
	public Player getPlayer1() {
		return player1;
	}

	/** Attribute named "player2" type "Player". */
	private final Player player2;

	/**
	 * Player player2's getter.
	 * 
	 * @return Player player2
	 */
	public Player getPlayer2() {
		return player2;
	}

	/** Attribute named "grid" type "Grid". */
	private final Grid grid;

	public Grid getGrid() {
		return grid;
	}

	/** Attribute named "currentPlayer" type "Player". */
	private Player currentPlayer;

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	/**
	 * Create a new game for the two given players.
	 * 
	 * @param name1
	 * @param name2
	 */
	public Game(final String name1, final String name2) {
		player1 = new Player(name1, Piece.RED);
		player2 = new Player(name2, Piece.YELLOW);
		grid = new Grid();
		setCurrentPlayer(player1);
	}

	/** Switch of player. */
	private void switchPlayer() {
		setCurrentPlayer((Objects.equals(getCurrentPlayer(), player1)) ? player2
				: player1);
	}

	/** Starter function. */
	public void start() {
		
		user.displayGrid();

		while (!grid.win() && !grid.areAllColumnFull()) {
			playARound();
			switchPlayer();
		}

		if (grid.win()) {
			switchPlayer();
			user.displayWin();;
		} else {
			user.displayEguality();
		}
	}
	
	private User user;

	/**
	 * Play a round.
	 * 
	 * @param currentPlayer
	 */
	private void playARound() {
		try {
			user.displayCurrentPlayer(currentPlayer);
			int choosenColumn = inputColumn();
			grid.placementPiece(choosenColumn, getCurrentPlayer().getPiece());
			user.displayGrid();;
		} catch (OutOfRangeException ignore) {
			user.displayErrOutOfRange();;
			playARound();
		} catch (FullColumnException ignore) {
			user.displayErrColumnFull();
			playARound();
		}
	}

	/**
	 * Function input a column.
	 * 
	 * @return int column
	 * @throws OutOfRangeException
	 * @throws FullColumnException
	 */
	public int inputColumn() throws OutOfRangeException, FullColumnException {
		Scanner scanner = user.displayScanner();
		user.displayColumnRange();
		int column = user.displayNextInt(scanner);
		if ((column < 0) || (column >= Grid.NBCOLUMN)) {
			throw new OutOfRangeException();
		}
		if (grid.isColumnFull(column)) {
			throw new FullColumnException();
		}
		return column;
	}


}
