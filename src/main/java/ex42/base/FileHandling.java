/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex42.base;

import java.io.*;

public class FileHandling {

	public static FileWriter getOutputStream() throws IOException {
		File out = new File(getProjectDirectory() + "\\src\\main\\resources\\ex42\\exercise42_output.txt");
		if (!out.exists()) {
			out.createNewFile();
		}

		return new FileWriter(out);
	}

	public static BufferedReader getInputStream() throws FileNotFoundException {
		return new BufferedReader(new FileReader(getProjectDirectory() + "\\src\\main\\resources\\ex42\\exercise42_input.txt"));
	}

	private static File getProjectDirectory() {
		return new File(System.getProperty ("user.dir"));
	}
}
