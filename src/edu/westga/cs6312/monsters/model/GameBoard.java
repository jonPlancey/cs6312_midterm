package edu.westga.cs6312.monsters.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class GameBoard {

	private ArrayList<Room> rooms;	
	private Random randomObject;	
	private Player player;
	private int currentRoom;
	

	/** 
	 * constructor for GameBoard             
	 */	
	public GameBoard() {		
		this.randomObject = new Random();
		this.setupBoard();
	}

		
	/** 
	 * creates a kicking monster 
	 * @return kickMonster object
	 */
	private void setupBoard() {	
		this.player = new Player();
		this.rooms = new ArrayList <Room>(10);
		this.populateRoom();
		this.currentRoom = 0;		
	}
	
	/** 
	 * loop though array to create and
	 * assign new Rooms to each element
	 */
	private void populateRoom() {
		for (int counter = 0; counter < 10; counter++) {
			Room room = new Room(counter, this.randomObject);
			this.rooms.add(room);	
		}
	}		
	
	
	/** 
	 * Get player's game object
	 * @return returns the game's Player object
	 */
	public Player getPlayer() {					
		return this.player;
	}	
	
	/** 
	 * Room where the Player is currently located
	 * @return returns players current room
	 */
	public int getCurrentRoom() {					
		return this.currentRoom;
	}	
	
	/** 
	 * Creates a string object describing game board
	 * @return returns String representation of game board
	 */ 
	public String toString() {	
		String printOutput = "";
		for (int count = 0; count < this.rooms.size(); count++) {
			printOutput += this.rooms.get(count).toString() + "\n";
		}
		return printOutput;		
	}
	
	/** 
	 * Return if monster is in room
	 * @return returns String if monster is in room
	 */ 
	public String isMonsterInRoom() {	
		String printMe = "";
		if (this.rooms.get(this.getCurrentRoom()).getMonster() == null) {
			printMe = "with no Monster inside";
		} else {
			printMe = "with Kicking Monster inside";
		}		
		return printMe;		
	}		
	
	
	
	
	/** 
	 * Move Player right
	 */
	public void moveRight() {
		this.currentRoom = (this.currentRoom + 1) % 9; 
	}
	
	
	
	/** 
	 * Move Player Left
	 */
	public void moveLeft() {					
		this.currentRoom = (this.currentRoom - 1) % 9; 
	}
}
