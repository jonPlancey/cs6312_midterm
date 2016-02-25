package edu.westga.cs6312.monsters.tests;

import static org.junit.Assert.*;

import java.util.Random;
import org.junit.Test;
import edu.westga.cs6312.monsters.model.PunchingMonster;




/**
 * Midterm Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class PunchingMonsterWhenPunchingMonsterGetHealthCredits {

	/** 
	 * unit test for health
	 */	
	@Test
	public void punchingMonsterGetHealthCredits() {
		Random random = new Random();
		PunchingMonster monster = new PunchingMonster(75, random);
		int expect = 75; 
		int results = monster.getHealthCredits();
		assertEquals(expect, results);	
	}

}
