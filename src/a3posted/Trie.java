package a3posted;

//  COMP 250 - Introduction to Computer Science - Fall 2012
//  Assignment #3 - Question 1

import java.util.*;

// Trie class.  Each node is associated with a prefix of some key 
// stored in the trie.   (Note any string is a prefix of itself.)

public class Trie {
	private TrieNode root;

	// Empty trie has just a root node. All the children are null.

	public Trie() {
		root = new TrieNode();
	}

	public TrieNode getRoot() {
		return root;
	}

	// Return true if key is contained in the trie (i.e. it was added by
	// insert), false otherwise

	public boolean contains(String key) {
		// ADD YOUR CODE HERE

		return false; // REPLACE THIS STUB
	}

	// Insert key into the trie. The first step should be finding the longest
	// prefix of key already in the trie (use getPrefixNode() below).
	// Then add TrieNodes in such a way that the key is inserted.

	public void insert(String key) {
		// ADD YOUR CODE HERE

	}

	// insert each key in the list (keys)

	public void loadKeys(ArrayList<String> keys) {
		for (int i = 0; i < keys.size(); i++) {
			// System.out.println("Inserting " + keys.get(i));
			insert(keys.get(i));
		}
		return;
	}

	// Return the TrieNode corresponding the longest prefix of a key that is
	// found.
	// If no prefix is found, return the root.
	// In the example in the PDF, running getPrefixNode("any") should return the
	// dashed node under "n", since "an" is the longest prefix of "any" in the
	// trie.
	// getPrefixNode("addition") should return the node which is the first
	// child of the root since "a" is the longest prefix of "addition" in the
	// trie.

	private TrieNode getPrefixNode(String word) {
		// ADD YOUR CODE HEE

		return null; // REPLACE THIS STUB
	}

	// Similar to getPrefixNode() but now return the prefix as a String,
	// rather than as a TrieNode.

	public String getPrefix(String word) {
		return getPrefixNode(word).toString();
	}

	// Return a list of all keys in the trie that have the given prefix.

	public ArrayList<String> getAllPrefixMatches(String prefix) {
		// ADD YOUR CODE HERE

		return null; // REPLACE THIS STUB
	}

}
