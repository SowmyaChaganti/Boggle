package library.datastructures.trie;

import java.util.HashMap;

public class TrieNode {
	
	private String c;
    private HashMap<String, TrieNode> children = new HashMap<String, TrieNode>();
    private boolean visited;
 
    public TrieNode() {}
 
    public TrieNode(String word){
        this.c = word;
        if(word.length() > 1) {
    		this.c = word.substring(0, 1);
    		this.insert(word.substring(1));
    	}
    }
    
    
    public void insert(String word) {
    	String currentLetter = word; //e
    	
    	if(word.length() > 1) {
    		currentLetter = word.substring(0, 1);
    	}
    	
    	TrieNode currentNode = this.children.get(currentLetter);//nope
    	
    	if(currentNode == null) {
    		
    		currentNode = new TrieNode(currentLetter);
    		this.children.put(currentLetter, currentNode);
    	}
		
    	currentNode.insert(word);
	}
    
    public boolean isLeaf() {
    	return (children.size()==0);
    }
    
    public void addLetter(String letter) {
    	if(!this.children.containsKey(letter)) {
    		TrieNode currentNode = new TrieNode(letter);
        	this.children.put(letter, currentNode);
    	}
    }

	
}
