package edu.westga.cs6312.monsters.view;

import java.util.Scanner;
import edu.westga.cs6312.monsters.model.GameBoard;

/**
 * Midterm  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.24.2016
 */
public class MonsterTUI {
	
	private Scanner userKeyboard;
	private GameBoard board;
	
	/**
	 * initialize the instance variable(s).
	 */	
	
	/** 
	 * constructor for MonsterTUI
	 * @param board 	game's board 
	 * Precondition: board is not null  
	 * Postcondition: userKeyboard instance variable will be set
	 * Postcondition: board instance variable will be set      
	 */	
	public MonsterTUI(GameBoard board) {
		if (board == null) {
			throw new IllegalArgumentException("Invalid gameBoard");
		}		
		this.userKeyboard = new Scanner(System.in);
		this.board = board;
	}
	
	
	
	/** 
	 * accept a parameter containing message to be printed 
	 * to the user describing to them what number to enter. 
	 * @param message message to be printed to the user
	 * 
	 * Precondition: !message.equals("")  
	 * Postcondition: healthCredits = health               
	 */	
	private int getUserNumber(String message) {
		if (!message.equals("")) {
			throw new IllegalArgumentException("Invalid value, enter string");
		}		
		
		return Integer.parseInt(message);
	}	
	
	
	
	
	
	
	
	
	/**
	 * controls program flow 
	 **/	
	public void run() {
		int userchoice = 0;	
		
		this.displayMenu();		
		

		try {
			userchoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter 1, 2, 3 or 9. \n");
		}
		this.selectionCategories(userchoice);	
	}
	
	/**
	 * Displays the following numbered 
	 * list of menu options on the console:
	 **/
	public void displayMenu() {
		System.out.println("Welcome to the time collection application");		
		System.out.println("1 - Describe room 		 \n\t A description of the room's contents will be displayed:");
		System.out.println("2 - Describe player 	 \n\t A description of the player will be displayed:");
		System.out.println("3 - Describe game board  \n\t A description of the game board will be displayed:"); 		
		System.out.println("9 – Quit the application \n\t Thank the user for using the application!");	
	}
	
	/**
	 * main menu options
	 * prompt user to select 1-3
	 * @param userChoice users menu selection
	 **/
	public void displayMenuInput(int userChoice) {			
		try {
			userChoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter a number between 1 and 3. \n");
		}
		this.selectionCategories(userChoice);
	}	
	
	
	
	/**
	 * Decides what functions execute based on user input
	 * @param userchoice user's menu selection
	 **/	
	public void selectionCategories(int userchoice) {		
		switch (userchoice) {
			case 1:	
				System.out.println("\n    [1 Add a time]");	   
	    		this.addTime();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);	
				break;
	        case 2: 
	        	System.out.println("\n*   [2 Display list of time]");
	        	this.displayTime();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);		        	
	            break;
	        case 3: 
	        	System.out.println("\n    [3 Quit]");
	        	System.out.println("    We hope you enjoyed this program.\n\n");
	            break;
	        default: 
	        	System.out.print("Not valid input. \n\n");
	        	this.displayMenu();
	        	break;		
		}	
	}	

	/**
	 * Display list of animals
	 **/
	public void displayTime() {	

	}
	
	
	/**
	 * prompts and captures input to add animal to animal collection
	 **/	
	public void addTime() {
	

	}
	
	
	/**
	 * provides specific text that causes input errors 
	 * @param error accepts ERROR from try catch 
	 * @return returns the value\input responsible for error
	 */
	private String getErrorString(NumberFormatException error) {
		int first = error.getMessage().indexOf("\"", 0) + 1; 
		int second = error.getMessage().lastIndexOf("\"");
	
		return error.getMessage().substring(first, second);		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
