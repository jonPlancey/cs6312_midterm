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
	 * @param gameBoard 	game's board 
	 * Precondition: board is not null  
	 * Postcondition: userKeyboard instance variable will be set
	 * Postcondition: board instance variable will be set      
	 */	
	public MonsterTUI(GameBoard gameBoard) {
		if (gameBoard == null) {
			throw new IllegalArgumentException("Invalid gameBoard");
		}		
		this.userKeyboard = new Scanner(System.in);
		this.board = gameBoard;
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
		if (message.equals("")) {
			throw new IllegalArgumentException("Invalid value, enter string");
		}	
		
		int userchoice = 0;
		
		try {
			System.out.print(message);
			userchoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter 1, 2, 3 or 9. \n");
		}
		return userchoice;
	}	
	
	
	/**
	 * Describe room
	 **/	
	public void describeRoom() {
		System.out.println("Player currently in room " + this.board.getCurrentRoom() + " " + this.board.isMonsterInRoom() +  "\n");
	}
	
	
	/**
	 * Describe Player
	 **/	
	public void describePlayer() {		
		System.out.println(this.board.getPlayer() + " health credits.  Location: room " + this.board.getCurrentRoom() + "\n");
	}	
	

	/**
	 * Describe game board
	 **/	
	public void describeBoard() {	
		System.out.println(this.board.toString());
		System.out.println(this.board.getPlayer() + " health credits and is location in room " + this.board.getCurrentRoom() + "\n");
		
	}	
	
	
	/** 
	 * Moves player 
	 * @param left	move player left
	 * @param right	move player right 
	 * 
	 * Precondition: left == 1, right == 2
	 * Postcondition: left and right will always be 1 or 2               
	 */	
	public void move(int left, int right) {	
		if (left != 1) {
			throw new IllegalArgumentException("Invalid selection 1 for left");
		}	
		if (right != 2) {
			throw new IllegalArgumentException("Invalid selection 2 for right");
		}			
		int userchoice = 0;	
		try {
			userchoice = this.getUserNumber(" Your directions:  (1) Left or (2) Right ");
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter 1 or 2 \n");
		}
		
		this.selectionCategories(userchoice);			
	}	
	
	
	
	
	/**
	 * controls program flow 
	 **/	
	public void run() {
		int userchoice = 0;	
		this.displayWelcome();
		this.displayMenu();		
		
		try {
			userchoice = this.getUserNumber("Enter selection: ");
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter 1, 2, 3 or 9. \n");
		}
		
		this.selectionCategories(userchoice);	
	}
	
	
	/**
	 * Displays the welcome
	 **/
	private void displayWelcome() {		
		System.out.println("Welcome to the time collection application");		
	
	}
	
	
	/**
	 * Displays menu options:
	 **/
	private void displayMenu() {		
		System.out.println("1 - Describe room\t 2 - Describe player ");
		System.out.println("3 - Describe game board\t 9 � Quit the application");
	}

	
	
	/**
	 * main menu options, prompt user to select
	 * @param userChoice users menu selection
	 **/
	private void displayMenuInput(int userChoice) {			
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
	private void selectionCategories(int userchoice) {		
		switch (userchoice) {
			case 1:	
				System.out.println("\n    [1 Describe room]");	   
				this.describeRoom();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);	
				break;
	        case 2: 
	        	System.out.println("\n*   [2 Describe player]");
	        	this.describePlayer();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);		        	
	            break;
	        case 3: 
	        	System.out.println("\n*   [3  Describe game board]");
	        	this.describeBoard();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);		        	
	            break;	            
	        case 9: 
	        	System.out.println("\n    [9 Quit]");
	        	System.out.println("    We hope you enjoyed this program.\n\n");
	            break;
	        default: 
	        	System.out.print("Not valid input. \n\n");
	        	this.displayMenu();
	        	this.displayMenuInput(userchoice);
	        	break;		
		}
		System.out.println("\n\n");
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
