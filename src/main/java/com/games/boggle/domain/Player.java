package com.games.boggle.domain;

import java.util.List;

public interface Player {
	public int playerScore=0;
	
	public void searchWords(Board boggleBoard, Dictionary dictionary);
	public void searchWords(char[][] boggleBoard, Dictionary dictionary);
	public List<String> getFoundWords();
	public void setScore(int score);
	public int getScore();
	

}
