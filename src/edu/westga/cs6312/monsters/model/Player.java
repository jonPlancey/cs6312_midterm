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
	 * 
	 * Precondition: health > 0  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
	 * Postcondition: healthCredits = health               
	 */
	public Player() {
		super(100);
	}
	
	/** 
	 * returns the number of health credits to be 
	 * deducted from the participant they are fighting.
	 * @return health credits to be deducted from the participant
	 */ 	
	public int fight() {
		return 0;
	}

}
