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
	 * Constructor for GameBoard
	 */ 
	public GameBoard(Random randomObject) {
		
	}

	
	
	/** 
	 * creates a kicking monster 
	 * @return kickMonster object
	 */
	private void setupBoard() {	
		KickingMonster kickMonster = new KickingMonster();
		return kickMonster;
	}
	
	
	
	
	/** 
	 * Creates a string object describing game board
	 * @return returns String representation of game board
	 */ 
	public String toString() {	
		//note print out rooms
		return this.rooms + ":" + this.randomObject + ":" + this.player + ":" + this.currentRoom;
	}	
}
