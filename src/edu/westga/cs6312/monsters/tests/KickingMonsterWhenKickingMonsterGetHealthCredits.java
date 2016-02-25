package edu.westga.cs6312.monsters.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.monsters.model.KickingMonster;



/**
 * Midterm Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class KickingMonsterWhenKickingMonsterGetHealthCredits {

	
	/** 
	 * tests to confirm that the 
	 * accessor method functions correctly
	 */	
	@Test
	public void testWhenKickingMonsterGetHealthCredits() {
		KickingMonster monster = new KickingMonster();
		int expect = 100; 
		int results = monster.getHealthCredits();
		assertEquals(expect, results);	
	}

}
