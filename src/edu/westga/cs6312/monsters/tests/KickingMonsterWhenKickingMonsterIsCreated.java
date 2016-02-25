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
public class KickingMonsterWhenKickingMonsterIsCreated {
	
	
	/** 
	 * tests to confirm constructor 
	 *  methods function correctly
	 */	
	@Test
	public void testWhenKickingMonsterIsCreated() {
		KickingMonster monster = new KickingMonster();
		int expect = 100; 
		int results = monster.getHealthCredits();
		assertEquals(expect, results);
	}
	
	/** 
	 * tests to confirm toString 
	 * methods function correctly
	 */	
	@Test
	public void testToString() {
		KickingMonster monster = new KickingMonster();
		String expect = "player:100"; 
		String results = monster.toString();
		assertEquals(expect, results);
	}


}
