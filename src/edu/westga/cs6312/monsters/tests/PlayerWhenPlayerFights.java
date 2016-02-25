package edu.westga.cs6312.monsters.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.monsters.model.Player;



/**
 * Midterm Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class PlayerWhenPlayerFights {

	
	/** 
	 * tests to confirm that the 
	 * fight method functions correctly
	 */	
	@Test
	public void testWhenPlayerFights() {
		Player player = new Player();		
		int expect = 50;
		int results = player.getHealthCredits() + player.fight();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * tests to confirm that the 
	 * fight method functions correctly
	 */	
	@Test
	public void testWhenPlayerFightsTwice() {
		Player player = new Player();		
		int expect = 0;
		int results = player.getHealthCredits() + player.fight() + player.fight();
		assertEquals(expect, results);
	}	

}
