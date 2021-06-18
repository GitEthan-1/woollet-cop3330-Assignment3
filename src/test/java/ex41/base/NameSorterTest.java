/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

	@Test
	void getOutput() {
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
	void getNames() {
	}
}