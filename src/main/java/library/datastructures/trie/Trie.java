package library.datastructures.trie;

public class Trie {
	
	public TrieNode root = new TrieNode();
	public Trie() {}
	
	public Trie(String word) {
		this.root = new TrieNode();
	}
	
	public void insert(String word) {
		this.root.insert(word.substring(1));
	}

}
