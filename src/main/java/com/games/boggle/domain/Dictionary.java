package com.games.boggle.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	
	public static final Dictionary NULL = new Dictionary();
	
	private List<String> words; 
	private int wordIndex=0;
	private File dictionaryFile;

	public Dictionary(File dictionaryFile) {
		
		this.dictionaryFile = dictionaryFile;
		this.words = new ArrayList<String>();
	}
	
	public void load() {
		//load the file into memory into words list
	}
	
	public String getNextWord() {
		String retval = "";
		
		if(hasMoreWords()) {
			retval = this.words.get(this.wordIndex);
			this.wordIndex++;
		}
		return retval;
	}
	
	public boolean hasMoreWords() {
		return this.wordIndex<this.words.size();
		
	}
	
	public void reset() {
		this.wordIndex = 0;
	}

}
