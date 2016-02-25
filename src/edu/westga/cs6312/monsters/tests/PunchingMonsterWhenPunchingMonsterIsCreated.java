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
public class PunchingMonsterWhenPunchingMonsterIsCreated {

	/** 
	 * unit test for toString
	 */	
	@Test
	public void punchingMonsterToString() {
		Random random = new Random();
		PunchingMonster monster = new PunchingMonster(75, random);
		String expect = "player:75"; 
		String results = monster.toString();
		assertEquals(expect, results);
	}

	/** 
	 * unit test for contructor
	 */	
	@Test
	public void whenPunchingMonsterGetHealthCredits() {
		Random random = new Random();
		PunchingMonster monster = new PunchingMonster(75, random);
		int expect = 75; 
		int results = monster.getHealthCredits();
		assertEquals(expect, results);	
	}

}
