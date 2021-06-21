/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex46.base;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Exercise 46 - Word Frequency Finder
 * Knowing how often a word appears in a sentence or block of text is helpful for creating word clouds and other types of word analysis.
 * And it’s more useful when running it against lots of text.
 *
 * Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file.
 * Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 *
 * Example Output
 *
 * Given the text file `exercise46_input.txt` with this content
 *----------------------------------------------------------------
 * badger badger badger
 * badger mushroom
 * mushroom snake badger badger
 * badger
 *----------------------------------------------------------------
 *
 * the program would produce the following output:
 *----------------------------------------------------------------
 * badger:   *******
 * mushroom: **
 * snake:    *
 *----------------------------------------------------------------
 *
 * Constraint
 *
 * Ensure that the most used word is at the top of the report and the least used words are at the bottom.
 *
 * Challenges
 *
 * Use a graphical program and generate bar graphs.
 * Test the performance of your calculation by providing a very large input file, such as Shakespeare's Macbeth.
 * Tweak your algorithm so that it performs the word counting as fast as possible.
 * Write the program in another language and compare the processing times of the two implementations.
 */

public class App46 {

	// locate input file
	// create new file reader
	// read in file string
	// parse to a String array
	// add array to total words
	// go through word object array and update count of any new instances of a word
		//if a word does not yet exist, create one
	// sort updated word object array order by word frequency
	// tabulate word object array to a graph in string form
	// output graph sting to console

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(FileHandler.getInputFile("exercise46_input.txt"));
		String fileData = FileHandler.readFile(input);

		WordCounter counter = new WordCounter();

		counter.addWords(fileData);

		System.out.println(counter.toGraph());

	}
}
