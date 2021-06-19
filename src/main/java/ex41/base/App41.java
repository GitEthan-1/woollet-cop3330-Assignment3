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
			// find input file and create buffered reader for reader for the input stream of chars
			inFile = new BufferedReader( getInputFile("exercise41_input.txt"));


			// read in file data and store onto an arraylist

			// create new array list and fill with data from input file
			ArrayList<String> names = NameSorter.getNames(inFile);


			// sort arraylist based on last name
			Collections.sort(names);


			// print out new sorted and formatted list onto output file in resources folder

			//create new output file within resource folder
			File outputFile = getOutputFile("exercise41_output.txt");

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

				//System.out.println("TASK COMPLETED SUCCESSFULLY");  FOR TESTING
			}
			catch (NullPointerException npe) {
				npe.printStackTrace();
			}
		}
	}


	public static File getOutputFile(String outputFileName) throws IOException {
		if(!new File(getProjectDirectory() + "\\output").exists()) {
			File outputDirectory = new File(getProjectDirectory() + "\\output");
			outputDirectory.mkdir();
		}
		File outputFile = new File(getProjectDirectory() + "\\output\\" + outputFileName);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}
		return outputFile;
	}

	public static FileReader getInputFile(String inputFileName) throws FileNotFoundException {
		return new FileReader(getProjectDirectory() + "\\input\\" + inputFileName);
	}

	public static File getProjectDirectory() {
		return new File(System.getProperty ("user.dir"));
	}


}
