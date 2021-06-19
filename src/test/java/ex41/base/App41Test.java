/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex41.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class App41Test {

	@Test
	void getProjectDirectory() {

		File[] directory = App41.getProjectDirectory().listFiles();

		if(!Arrays.toString(directory).contains(".idea")) { fail(); }
		if(!Arrays.toString(directory).contains("pom.xml")) { fail(); }
		if(!Arrays.toString(directory).contains("src")) { fail(); }
		if(!Arrays.toString(directory).contains(".gitignore")) { fail(); }
		if(!Arrays.toString(directory).contains("output")) { fail(); }
		if(!Arrays.toString(directory).contains("input")) { fail(); }
	}

	@Test
	void getOutputFile() throws IOException {

		File test = App41.getOutputFile("exercise41_test_output.txt");

		if(!test.exists()) { fail(); }
	}

}