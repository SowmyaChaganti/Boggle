package com.games.boggle.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.games.boggle.domain.realization.ComputerPlayer;

public class Game {
	private final static int MIN_BOARD_SIZE 	  = 4;
	private final static int MAX_BOARD_SIZE 	  = 10;
	private final static int ERROR_INPUT_LENGTH = -1;
	private final static int ERROR_BOARD_SIZE   = -2;
	private final static int ERROR_NON_INTEGER  = -3;
	private final static int ERROR_MISSING_FILE = -4;
	
	private Board board = Board.NULL;
	private Dictionary dictionary = Dictionary.NULL;
	private List<Player> players = new ArrayList<Player>();
	
	public Game(int boardSize, File dictionaryFile) {
		this.board = new Board(boardSize);
		this.dictionary = new Dictionary(dictionaryFile);
		this.players.add();
	}
	
	public static void main(String[] args) {
		int boardSize=0;
		
		System.out.println("Boggle Game!");
		if(args.length != 2) {
			Game.usage();
			System.exit(Game.ERROR_INPUT_LENGTH);
		}
		
		try {
			boardSize = Integer.parseInt(args[0]);
			if (boardSize < Game.MIN_BOARD_SIZE && boardSize > Game.MAX_BOARD_SIZE) {
				Game.usage();
				System.exit(Game.ERROR_BOARD_SIZE);
			}
		}
		catch (Exception e) {
			Game.usage();
			System.exit(Game.ERROR_NON_INTEGER);
		}
		
		File dictionaryFile = new File(args[1]);
		if(!dictionaryFile.exists()) {
			Game.usage();
			System.exit(Game.ERROR_MISSING_FILE);
		}
		
		Game game = new Game(boardSize, dictionaryFile);
	}
	
	public static void usage() {
		System.out.println("The Boggle game expects you to provide the following parameters, in order:");
		System.out.println("1. the size of the Boggle board (min size: " + Game.MIN_BOARD_SIZE + " and max size: " + Game.MIN_BOARD_SIZE);
		System.out.println("2. the path and file name of the dictionary you wish to use for the Boggle game");
	}
	
	public void startGame(int playerCount) {
		System.out.println("Choose a board from the following:");
		System.out.println("1) Use standard board");
		System.out.println("2) Generate new game board board");
		System.out.println();
		
		Board board = new Board(4);
		System.out.println("Standard Board:");
		board.populateBoard();
		System.out.println();
		
		if(playerCount==1) {
			ComputerPlayer computer = new ComputerPlayer();
			Dictionary dictionary = new Dictionary();
			computer.searchWords(boggleBoard, dictionary);
		}
		else {
			//HumanPlayer human = new HumanPlayer();
		}
	}
}
