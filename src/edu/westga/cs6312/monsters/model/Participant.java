package edu.westga.cs6312.monsters.model;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public abstract class Participant {
	
	private int healthCredits;
	
	/** 
	 * 1 parameter constructor to create an Participant  
	 * @param health	health left for player 
	 * 
	 * Precondition: health > 0  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
	 * Postcondition: healthCredits = health               
	 */
	public Participant (int health) {
		if (health < 0) {
			throw new IllegalArgumentException("Invalid health");
		}		
		this.healthCredits = health;
	}

	/** 
	 * Gets the health of player
	 * @return current health of player
	 */ 	
	public int getHealthCredits (){
		return healthCredits;
	}
	
}
