package edu.westga.cs6312.monsters.model;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class Player extends Participant {

	/** 
	 * initialize the Player's health credits to 100             
	 */
	public Player() {
		super(100);
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
		return -50;
	}

	/** 
	 * Gets the health of player
	 * @return current health of player
	 */ 	
	public int getHealthCredits() {
		return super.getHealthCredits();
	}
}
