package edu.westga.cs6312.monsters.model;

import java.util.Random;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class PunchingMonster extends Participant {

	private Random randomObject;
	
	/** 
	 * initialize the Player's health credits to 100             
	 */
	
	
	/** 
	 * 1 parameter constructor to create an Participant  
	 * @param health	health left for player 
	 * @param random Random object to initialize instance variables 
	 * 
	 * Precondition: health > 0  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
	 * Postcondition: healthCredits = health               
	 */	
	public PunchingMonster(int health, Random random) {
		super(75);
		if (random == null) {
			throw new IllegalArgumentException("Invalid random number");
		}		

		this.randomObject = random;
	}	
	
	
	/** 
	 * Creates a string object describing player
	 * @return returns String representation of player
	 */ 
	public String toString() {					
		return super.toString();
	}		
	
	
	/** 
	 * inflict 50 health points of damage upon the participant
	 * @return health credits to be deducted from the participant
	 */ 	
	public int fight() {
		return -this.randomObject.nextInt(50);
	}

	/** 
	 * Gets the health of player
	 * @return current health of player
	 */ 	
	public int getHealthCredits() {
		return super.getHealthCredits();
	}

}
