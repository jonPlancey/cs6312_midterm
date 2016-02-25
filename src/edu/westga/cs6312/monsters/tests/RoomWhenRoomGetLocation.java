package edu.westga.cs6312.monsters.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.monsters.model.Room;
import java.util.Random; 



/**
 * Midterm Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class RoomWhenRoomGetLocation {
	
	/** 
	 * tests to confirm the accessor
	 *  method functions correctly. 
	 */	
	@Test
	public void testWhenRoomGetLocation00() {
		Random newRandom = new Random();
		Room room = new Room(0, newRandom);
		String expect = "Room at (0)"; 
		String results = room.getLocation();
		assertEquals(expect, results);		
	}
	
	
	/** 
	 * tests to confirm the accessor
	 *  method functions correctly. 
	 */	
	@Test
	public void testWhenRoomGetLocation02() {
		Random newRandom = new Random();
		Room room = new Room(2, newRandom);
		String expect = "Room at (2)"; 
		String results = room.getLocation();
		assertEquals(expect, results);		
	}	

}
