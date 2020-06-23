package com.games.boggle.domain.realization;

import java.util.List;

import com.games.boggle.domain.Board;
import com.games.boggle.domain.Dictionary;
import com.games.boggle.domain.Player;

import library.datastructures.trie.Trie;

public class ComputerPlayer implements Player {
	private int playerScore = 0;

	@Override
	public void searchWords(Board boggleBoard, Dictionary dictionary) {
	}

	@Override
	public List<String> getFoundWords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void searchWords(char[][] boggleBoard, Dictionary dictionary) {
		Trie trie = new Trie(boggleBoard);
		trie.createTrie(boggleBoard);
		
	}

}

