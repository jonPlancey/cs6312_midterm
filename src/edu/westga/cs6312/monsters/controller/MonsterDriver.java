package edu.westga.cs6312.monsters.controller;

import edu.westga.cs6312.monsters.model.GameBoard;
import edu.westga.cs6312.monsters.view.MonsterTUI;

/**
 * Midterm  
 * @author cs6312
 * @author jim perry, jr.
 * @version 02.24.2016
 */
public class MonsterDriver {

	/**
	 * This method is the entry point of the application
	 * @param args Command line arguments, not used
	 */ 
	public static void main(String[] args) {
		GameBoard board = new GameBoard(); 
		MonsterTUI gui = new MonsterTUI(board);
		gui.run();
	}

}
