package edu.westga.cs6312.monsters.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.monsters.model.GameBoard;




/**
 * Midterm Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class GameBoardWhenGameBoardGetCurrentRoom {

	
	/** 
	 * to confirm that the accessor 
	 * method returns a Room at location 0
	 */	
	@Test
	public void whenGameBoardGetCurrentRoom() {
		GameBoard board = new GameBoard();
		int expect = 0;
		int results = board.getCurrentRoom();
		assertEquals(expect, results);	
	}

}
