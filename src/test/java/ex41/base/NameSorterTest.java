/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex41.base;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

	@Test
	void getOutput_test() {
		ArrayList<String> test = new ArrayList<>();
		test.add("Alf");
		test.add("Troy");
		test.add("Robert");
		test.add("Cameron");
		Collections.sort(test);

		String expected = "Total of 4 names\n-----------------\nAlf\nCameron\nRobert\nTroy\n";
		String actual = NameSorter.getOutput(test);

		assertEquals(expected,actual);
	}

	@Test
	void getNames_test() throws IOException {
		BufferedReader testInFile = new BufferedReader(App41.getInputFile("exercise41_test_input.txt"));

		ArrayList<String> actual = NameSorter.getNames(testInFile);
		ArrayList<String> expected = new ArrayList<>();
		expected.add("cfghs");
		expected.add("bdth");
		expected.add("afhmgj");
		expected.add("ydbf");
		expected.add("ijfgyd");

		assertArrayEquals(actual.toArray(), expected.toArray());

	}
}