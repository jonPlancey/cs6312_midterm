package edu.westga.cs6312.monsters.model;


/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class KickingMonster extends Participant {

	
	/**
	 * initialize the instance variable(s).
	 */	
	public KickingMonster() {
		
	}
	
	/** 
	 * inflict 50 health points of damage upon the participant
	 * @return health credits to be deducted from the participant
	 */ 	
	public int fight() {
		return super.getHealthCredits() - 50;
	}	

}
