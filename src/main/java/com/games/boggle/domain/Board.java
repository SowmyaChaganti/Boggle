package com.games.boggle.domain;

import java.util.Random;

import com.boggle.java.Board;

public class Board {
	public final static Board NULL = new Board();
	
	private char[][] board;
	
	private Board() {
		board = new char[0][0];
	}
	
	public Board(int boardSize) {
		 this.board = new char[boardSize][boardSize];
	}
	
	public boolean isEqual(Board board) {
		if(board == null || Board.NULL == board) {
			return false;
		}
		return true;
	}
	
	public void generateBoard() {
		Random r = new Random();
		int boardSize = this.board.length;
		for(int i=0; i<boardSize; i++) {
			for(int j=0; j<boardSize; j++) {
				this.board[i][j] = (char) (r.nextInt(26)+'a');
				System.out.print(this.board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	//This method is for POC
	public void populateBoard() {	
		this.board[0][0] = 'B';
		this.board[0][1] = 'E';
		this.board[0][2] = 'A';
		this.board[0][3] = 'R';
		this.board[1][0] = 'O';
		this.board[1][1] = 'U';
		this.board[1][2] = 'L';
		this.board[1][3] = 'L';
		this.board[2][0] = 'N';
		this.board[2][1] = 'C';
		this.board[2][2] = 'Z';
		this.board[2][3] = 'E';
		this.board[3][0] = 'E';
		this.board[3][1] = 'F';
		this.board[3][2] = 'T';
		this.board[3][3] = 'B';
				
		for(char[] i:this.board) {
			System.out.println(i);
		}
		
	}

}
