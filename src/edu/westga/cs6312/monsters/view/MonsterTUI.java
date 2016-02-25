package edu.westga.cs6312.monsters.view;

import java.util.Scanner;
import edu.westga.cs6312.monsters.model.GameBoard;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class MonsterTUI {
	
	private Scanner userKeyboard;
	private GameBoard board;
	
	/**
	 * initialize the instance variable(s).
	 */	
	
	/** 
	 * constructor for MonsterTUI
	 * @param board 	game's board 
	 * Precondition: board is not null  
	 * Postcondition: userKeyboard instance variable will be set
	 * Postcondition: board instance variable will be set      
	 */	
	public MonsterTUI(GameBoard board) {
		if (board == null) {
			throw new IllegalArgumentException("Invalid gameBoard");
		}		
		this.userKeyboard = new Scanner(System.in);
		this.board = board;
	}
	
	/**
	 * controls program flow 
	 **/	
	public void run() {
		getUserNumber("1");
	}
	
	/** 
	 * accept a parameter containing message to be printed 
	 * to the user describing to them what number to enter. 
	 * @param message message to be printed to the user
	 * 
	 * Precondition: !message.equals("")  
	 * Postcondition: healthCredits = health               
	 */	
	private int getUserNumber(String message) {
		if (!message.equals("")) {
			throw new IllegalArgumentException("Invalid value, enter string");
		}		
		
		return Integer.parseInt(message);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
