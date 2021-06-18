/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex41.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class NameSorter {
	public static String getOutput(ArrayList<String> names) {
		StringBuilder output = new StringBuilder();
		output.append("Total of ").append(names.size()).append(" names\n").append("-----------------\n");
		for ( String name : names) {
			output.append(name).append("\n");
		}
		return output.toString();
	}

	public static ArrayList<String> getNames(BufferedReader inFile) throws IOException {
		ArrayList<String> names = new ArrayList<>();
		String readLine;
		while((readLine = inFile.readLine()) != null)
			names.add(readLine);
		return names;
	}
}
