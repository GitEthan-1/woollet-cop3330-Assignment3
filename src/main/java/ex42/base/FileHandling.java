/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex42.base;

import java.io.*;

public class FileHandling {

	public static BufferedReader getInputStream(String inputFileName) throws FileNotFoundException {
		return new BufferedReader(new FileReader(getProjectDirectory() + "\\input\\" + inputFileName));
	}

	private static File getProjectDirectory() {
		return new File(System.getProperty ("user.dir"));
	}
}
