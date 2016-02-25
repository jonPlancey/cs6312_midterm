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
	 * 1 parameter constructor to create an Participant  
	 * @param room	room's identifying number
	 * @param random Random object to initialize instance variables 
	 * 
	 * Precondition: room < 10 || room >= 0
	 * Precondition: random =! null  
	 * Postcondition: room is between 0 and 9, inclusive  
	 * Postcondition: healthCredits = health               
	 */	
	public Room(int room, Random random) {
		if (room > 10 || room < 1) {
			throw new IllegalArgumentException("Invalid room, 1-10 only");
		}
		if (random == null) {
			throw new IllegalArgumentException("Invalid random number");
		}
		this.roomNumber = room;
		this.randomObject = new Random();
		this.setupRoom();
	}
	

	/** 
	 * use the random number generator 
	 * object to randomly determine if a
	 * monster should be added to the room 
	 */
	private void setupRoom() {	
		int probability = randomObject.nextInt(101);
		if(probability < 50 ) {
			monster = null;
		} else {
			monster = createMonster(); 
		}
	}	
		
	
	/** 
	 * creates a kicking monster 
	 * @return kickMonster object
	 */
	private KickingMonster createMonster() {	
		KickingMonster kickMonster = new KickingMonster();
		return kickMonster;
	}	
	
	
	
	/** 
	 * returns a Participant object storing 
	 * the monster that's currently in Room
	 * @return monster in current room 
	 */
	public String getLocation() {					
		return "Room at (" + this.roomNumber + ")";
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
		return this.monster + ":" + this.roomNumber + ":" + this.randomObject;
	}	

}
