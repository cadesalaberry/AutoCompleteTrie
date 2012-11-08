# COMP 250 Assignment 3

Instructor: Prof. Michael Langer

Posted	: Fri, Nov. 2, 2012

Due	: Tue, Nov. 13, 2012 at 23:59


### General Instructions

* We will deduct points for assignments that are poorly commented or formatted, as this makes the evaluation more difficult.
* The late submission penalty is 20% per day, up to 3 days.
* *New for Assignment 3*: We will deduct 20% for any student who has to resubmit after the due date (i.e. late) because they submitted the wrong file (or some similarly avoidable administrative error). This policy will hold even regardless of whether the student can provide proof that the assignment was indeed “done” on time.


## Question 1 Implementing Autocomplete with a Trie (70 points)

### Introduction

In this question, you will work on the problem of storing a set of words (also called *keys*) in a tree data structure, and a method for efficiently finding all the words that contain a given prefix. By word or *key* here, we just mean a string formed from some set of symbols such as ASCII characters. (The term *key* has a technical meaning that you will learn about later in the course.) You should be familiar with the above problem through the autocomplete feature found on some cell phones and web forms. For instance, if you type in “aar", then autocomplete may suggest *aardvark, aardvarks, aardwolf, aardwolves, aargh*.


### Trie Data Structure

A trie is a type of tree used to efficiently index keys by storing their prefixes. (The term trie comes from the word “retrieval”. It is sometimes pronounced “try” although many people pronounce it the same as “tree”. ) The main property of a trie is that each edge corresponds to a character. Thus the path from the root of the trie to any node in the trie defines a string. The string defined by each node is a prefix of all strings defined by the descendents of that node.

Below is an example trie. It contains the following keys: *a, and, ax, dog, door, dot*. You will note that the dashed nodes correspond to prefixes in the trie that are not in our list of keys (*an, d, do, doo*). The trie must also keep track of this distinction by storing for each node whether it corresponds to a key or not.

Note that if C is the set of all possible characters defined at the edges, then each node can have
at most k = | C | children, where the | C | notation just means the number of elements in set C.

![alt text](https://docs.google.com/drawings/pub?id=1AQSLGJeQNIYg-FBVL_N4-ZhfrnPOHAFdHE2JqDo7df4&w=960&h=720 "Example of Trie with the words a, and, ax, dog, door, dot")


### Your task

Read the provided code (TrieNode.java, Trie.java, AutoComplete.java), including the comments which explain what the various methods are supposed to do.
For the **TrieNode** and **Trie** classes, fill in the missing code as indicated, namely:

* **TrieNode**: *createChild(), toString()*
* **Trie**: *contains(), insert(), getPrefixNode(), getAllPrefixMatches()*

You may write helper methods but, if you do, then add a comment explaining what you are doing so that the grader can easily follow. You may use any Java String methods that are used in the starter code e.g. *charAt()*. But you may not use String searching methods such as *String.startsWith()*, *String.substring()*, etc. The point of the assignment is for you to organize and compare strings use a trie data structure.

Submit only your modified files (**TrieNode.java**, **Trie.java**). Use the *AutoComplete.java* file to
test your code, but do not submit this file.


## Question 2 Running time analysis of Tries (30 points)

In this question, you will analyze the complexity of two of methods implemented in Question 1.. Suppose you are given a set of words, where each word is of length at most m characters. Let T1 denote an instance of the trie implemented in Question 1, and let N be the number of nodes of T1. Note that N typically does not equal n.

Answer the following questions. In each case, give the tightest bound you can. For example, if a runtime is O(n) and you write O(nm) then you have not given the tightest bound. In each case, *you must also provide a short written justification for your answer*. Notice that we are not asking for formal (mathematical) big O and big Omega proofs here.

Your answer should be in terms of the variables n, m, k, N which are defined in this PDF. Note that even though k=NUMCHILDREN is a constant in the code, we are asking you to treat it as a variable.

**1)** What is the O( ) bound of *loadKeys()* on T1?

**2)** What is the O( ) bound of *contains()* on T1?

Now recall that, in *TrieNode.java*, the children of each node is implemented using an array of size k = | C | which is the maximum number of children. In many tree data structures, however, the set of children is implemented using a linked list. Suppose we were to modify **TrieNode.java** so that each node's children were implemented using a LinkedList, rather than an array. Let T2 denote the modified trie data structure. Again, let N be the number of nodes in T2. *Note that this is the same N as above since the number of* **TrieNode** *objects will be the same*.

**3)** What is the O( ) bound of *loadKeys()* on T2 ?

**4)** What is the O( ) bound of *contains()* on T2 ?

Finally, we can compare the runtime of tries to the runtimes of binary search trees (BST). Suppose we were to consider a BST data structure to store the same set of keys. Each node in this BST would correspond to a key, such that the left (or right) child of each node is lexicographically smaller (or bigger) than its parent.


Note that the running time of operations on a BST depends on how “balanced" the tree is. (A tree is well balanced if the number of descendents of each left child is approximately the same as the number of descendents of each right child. This is not an exact definition, but it suffices for this question.)

Using the O( ) notation for *worst-case* and Ω() notation for *best-case*:

**5)** what is the O( ) bound of *loadKeys()* for a BST ?

**6)** what is the Ω ( ) bound of *loadKeys()* for a BST ?

**7)** what is the O( ) bound of *contains()* for a BST ?

**8)** what is the Ω ( ) bound of *contains()* for a BST ?

Assume that these methods perform the same role as they do for tries i.e. *loadKeys()* populates
a BST, and *contains()* searches for a key in BST.

Hint: Testing whether one string of length m is lexicographically bigger or smaller or the same
as another string of length m requires at least one comparison and at most m comparisons.


### Your Task

Submit a text file A2Q2.txt with answers to the questions. If you wish, you may write Omega( ) instead of Ω ( ).


![alt text](http://i.imgur.com/WWLYo.gif "Frustrated cat can't believe this is the 12th time he's clicked on an auto-linked README.md URL")
