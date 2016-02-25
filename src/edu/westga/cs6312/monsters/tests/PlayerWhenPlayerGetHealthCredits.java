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
public class PlayerWhenPlayerGetHealthCredits {

	
	/** 
	 * tests to confirm the accessor 
	 * method functions correctly
	 */	
	@Test
	public void testWhenPlayerGetHealthCredits() {
		Player player = new Player();
		int expect = 100; 
		int results = player.getHealthCredits();
		assertEquals(expect, results);	
	}

}
