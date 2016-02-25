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
public class PlayerWhenPlayerIsCreated {
	
	/** 
	 * tests to confirm constructor and
	 * toString methods function correctly
	 */	
	@Test
	public void testWhenPlayerIsCreated() {
		Player player = new Player();
		int expect = 100; 
		int results = player.getHealthCredits();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * tests to confirm toString 
	 * methods function correctly
	 */	
	@Test
	public void testToString() {
		Player player = new Player();
		String expect = "player:100"; 
		String results = player.toString();
		assertEquals(expect, results);
	}


}
