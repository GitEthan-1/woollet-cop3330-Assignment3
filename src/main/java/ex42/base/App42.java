/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex42.base;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Exercise 42 - Parsing a Data File
 * Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them.
 * CSV, or comma-separated values, is a common standard for doing this.
 *
 * Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):
 *
 * Ling,Mai,55900
 * Johnson,Jim,56500
 * Jones,Aaron,46000
 * Jones,Chris,34500
 * Swift,Geoffrey,14200
 * Xiong,Fong,65000
 * Zarnecki,Sabrina,51500
 *
 * Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
 *
 * Example Output
 *
 * Last      First     Salary
 * --------------------------
 * Ling      Mai       55900
 * Johnson   Jim       56500
 * Jones     Aaron     46000
 * Jones     Chris     34500
 * Swift     Geoffrey  14200
 * Xiong     Fong      65000
 * Zarnecki  Sabrina   51500
 *
 * Constraints
 *
 * Write your own code to parse the data. Don't use a CSV parser.
 *
 * Challenges
 *
 * Make each column one space longer than the longest value in the column.
 * Format the salary as currency with dollar signs and commas.
 * Sort the results by salary from highest to lowest.
 * Rework your program to use a CSV parsing library and compare the results.
 */

public class App42 {

	// read data from input file
		// locate file and create new FileReader with file path
		// create array of Persons and load with members
			// create new ArrayList of Person objects
			// read data from file with FileReader
			// parse data into separate strings
			// create new Person objects with parsed data and add each to ArrayList
	// create tabulated string of Person data
		// create new string with table header
		// format person objects into strings and append to table string
	// print table string to terminal output

	public static void main(String[] args) throws IOException {
		BufferedReader in = FileHandling.getInputStream("exercise42_input.txt");
		LinkedList<String> fileData = loadFileData(in);
		LinkedList<Person> people = createPeople(fileData);

		System.out.println(Person.getTable(people));
	}


	private static LinkedList<String> loadFileData(BufferedReader in) throws IOException {
		LinkedList<String> fileData = new LinkedList<>();
		String line;
		while((line = in.readLine()) != null) {
			fileData.add(line);
		}
		return fileData;
	}


	public static LinkedList<Person> createPeople(LinkedList<String> fileData) {
		LinkedList<Person> people = new LinkedList<>();
		for(String data : fileData) {
			people.add(new Person(data));
		}
		return people;
	}


}
