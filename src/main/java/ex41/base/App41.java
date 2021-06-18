/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex41.base;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Exercise 41 - Name Sorter
 * Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.
 *
 * Create a program that reads in the following list of names from a file called `exercise42_input.txt` and sorts the list alphabetically:
 *
 * Ling, Mai
 * Johnson, Jim
 * Zarnecki, Sabrina
 * Jones, Chris
 * Jones, Aaron
 * Swift, Geoffrey
 * Xiong, Fong
 *
 * Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.
 *
 * Example Output
 *
 * Total of 7 names
 * -----------------
 * Johnson, Jim
 * Jones, Aaron
 * Jones, Chris
 * Ling, Mai
 * Swift, Geoffrey
 * Xiong, Fong
 * Zarnecki, Sabrina
 *
 * Constraint
 *
 * Don't hard-code the number of names.
 *
 * Challenges
 *
 * Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
 * Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

public class App41 {
	public static void main(String[] args) throws IOException {
		BufferedReader inFile = null;
		PrintStream console = System.out;

		try{
			// open input file from project resources folder
			File projectDirectory = getProjectDirectory();

			// traverse to resource folder and open proper input test file

			// find absolute file directory of project
			FileReader inputFile = getInputFile(projectDirectory);


			// read in file data and store onto an arraylist

			// create new file scanner with input file path name
			inFile = new BufferedReader(inputFile);

			// create new array list and fill with data from input file
			ArrayList<String> names = NameSorter.getNames(inFile);


			// sort arraylist based on last name
			Collections.sort(names);


			// print out new sorted and formatted list onto output file in resources folder

			//create new output file within resource folder
			File outputFile = getOutputFile(projectDirectory);

			// format a string to be printed out to new file
			String output = NameSorter.getOutput(names);

			// print output string to file
			System.setOut(new PrintStream(outputFile));
			System.out.println(output);

		}
		catch (FileNotFoundException io) {
			System.out.println("ERROR: FILE NOT FOUND");
		}
		finally {
			//close all files and end program
			try {
				inFile.close();

				// reset the system output
				System.setOut(console);

				System.out.println("TASK COMPLETED SUCCESSFULLY");
			}
			catch (NullPointerException npe) {
				npe.printStackTrace();
			}
		}
	}


	private static File getOutputFile(File projectDirectory) throws IOException {
		File outputFile = new File(projectDirectory + "\\src\\main\\resources\\ex41\\exercise41_output.txt");
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}
		return outputFile;
	}

	private static FileReader getInputFile(File projectDirectory) throws FileNotFoundException {
		FileReader inputFile = new FileReader(projectDirectory + "\\src\\main\\resources\\ex41\\exercise41_input.txt");
		return inputFile;
	}

	private static File getProjectDirectory() {
		return new File(System.getProperty ("user.dir"));
	}


}
