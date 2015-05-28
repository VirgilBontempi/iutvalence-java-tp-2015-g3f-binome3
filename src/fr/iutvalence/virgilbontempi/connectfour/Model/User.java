package fr.iutvalence.virgilbontempi.connectfour.Model;

import java.util.Scanner;

public class User {
	
	private Game game;
	
	public void displayCurrentPlayer(Player currentPlayer){
		System.out.format("%s's round ! ", currentPlayer);
	}
	
	public void displayGrid(){
		System.out.println(game.getGrid());
	}
	
	public void displayErrOutOfRange(){
		System.err.println("Insert an other column, the selected column is out of range !");		
	}
	
	public void displayErrColumnFull(){
		System.err.println("Insert an other column, the selected column is full !");
	}
	
	public void displayWin(){
		System.out.println(game.getCurrentPlayer() + ", you won ! Congratulations !");
	}
	
	public void displayEguality(){
		System.out.println("Nobody has won");
	}
	
	public void displayColumnRange(){
		System.out.println("Insert a column ranged between 0 and 6 !");
	}
	
	public Scanner displayScanner(){
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	
	public int displayNextInt(Scanner scanner){
		return scanner.nextInt();
	}

}
