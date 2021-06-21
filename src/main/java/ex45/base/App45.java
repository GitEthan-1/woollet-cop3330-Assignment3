/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex45.base;

import java.io.*;
import java.util.Scanner;

/**
 * Exercise 45 - Word Finder
 * There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.
 *
 * Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
 * Replace each occurrence with use. Write the modified file to a new file.
 *
 * Example Output
 * Given the input file of
 *---------------------------------------------------------------------------
 * One should never utilize the word "utilize" in writing. Use "use" instead.
 * For example, "She uses an IDE to write her Java programs" instead of "She
 * utilizes an IDE to write her Java programs".
 *---------------------------------------------------------------------------
 *
 * The program should generate
 *---------------------------------------------------------------------------
 * One should never use the word "use" in writing. Use "use" instead.
 * For example, "She uses an IDE to write her Java programs" instead of "She
 * uses an IDE to write her Java programs".
 *---------------------------------------------------------------------------
 *
 * Constraints
 *
 * Prompt for the name of the output file.
 * Write the output to a new file.
 *
 * Challenges
 *
 * Modify the program to track the number of replacements and report that to the screen when the program finishes.
 * Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
 * Modify the program so that it can handle every file in a folder of files instead of a single file.
 */

public class App45 {

	// locate input file and create new reader
	// read string data from reader
	// create new string with replaced word
	// create new file
	// create new writer
	// write new string to output file
	// close ouput stream

	private static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(FileHandler.getInputFile("exercise45_input.txt"));

		String fileData = FileHandler.readFile(input);

		String outputString = WordReplacer.replace(fileData,"utilize" , "use");

		String outFileName = getString("Output file name? ");
		FileHandler.writeToFile(outputString, outFileName);

	}

	private static String getString (String message) {
		System.out.print(message);
		return in.nextLine();
	}
}
