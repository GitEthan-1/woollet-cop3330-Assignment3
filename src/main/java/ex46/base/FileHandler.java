/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex46.base;

import java.io.*;

public class FileHandler {

	public static FileReader getInputFile(String inputFileName) throws FileNotFoundException {
		return new FileReader(getProjectDirectory() + "\\input\\" + inputFileName);
	}

	private static File getProjectDirectory() {
		return new File(System.getProperty ("user.dir"));
	}

	public static String readFile(BufferedReader in) throws IOException {
		String line;
		StringBuilder data = new StringBuilder();
		while ((line = in.readLine()) != null) {
			data.append(line).append("\n");
		}

		return data.toString();
	}
}
