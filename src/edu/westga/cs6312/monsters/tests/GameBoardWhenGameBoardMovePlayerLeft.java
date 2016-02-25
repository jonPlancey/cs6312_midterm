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
public class GameBoardWhenGameBoardMovePlayerLeft {
	
	
	/** 
	 * unit test for movement
	 */	
	@Test
	public void whenGameBoardMovePlayerLeft02() {
		GameBoard board = new GameBoard();
		board.moveLeft();
		board.moveLeft();		
		int expect = -2;
		int results = board.getCurrentRoom();
		assertEquals(expect, results);	
	}
	
	
	/** 
	 * unit test for movement
	 */	
	@Test
	public void whenGameBoardMovePlayerLeft10() {
		GameBoard board = new GameBoard();
		board.moveLeft();
		board.moveLeft();	
		board.moveLeft();
		board.moveLeft();	
		board.moveLeft();
		board.moveLeft();			
		board.moveLeft();
		board.moveLeft();			
		board.moveLeft();
		int expect = 0;
		int results = board.getCurrentRoom();
		assertEquals(expect, results);	
	}	

}
