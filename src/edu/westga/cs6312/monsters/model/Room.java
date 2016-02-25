package edu.westga.cs6312.monsters.model;

import java.util.Random;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class Room {

	private Participant monster;
	private int roomNumber;
	private Random randomObject;
	
	/**
	 * initialize the instance variable(s).
	 */		
	public Room(int roomNumber, Random randomObject) {
		
	}
	

	
	
	
	/** 
	 * returns a Participant object storing 
	 * the monster that's currently in Room
	 * @return monster in current room 
	 */
	public String getLocation() {					
		return "Room at (" + roomNumber + ")";
	}	
	
	
	/** 
	 * returns a Participant object storing 
	 * the monster that's currently in Room
	 * @return monster in current room 
	 */
	public Participant getMonster() {					
		return this.monster;
	}
	
	
	/** 
	 * Creates a string object describing room
	 * @return returns String representation of monster
	 */ 
	public String toString() {					
		return monster + ":" + roomNumber + ":" + randomObject;
	}	

}
