package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class App42Test {

	@Test
	void createPeople_Test() {
		LinkedList<String> peopleData = new LinkedList<>();
		peopleData.add("abc,def,123");
		peopleData.add("ABC,DEF,123456");

		LinkedList<Person> expected = new LinkedList<>();
		expected.add(new Person("abc", "def", 123));
		expected.add(new Person("ABC", "DEF", 123456));

		LinkedList<Person> actual = App42.createPeople(peopleData);

		boolean flag = true;
		for (int i = 0; i < expected.size(); i++) {
			if(!expected.get(i).getFirstName().contentEquals(actual.get(i).getFirstName()))
				flag = false;
			if(!expected.get(i).getLastName().contentEquals(actual.get(i).getLastName()))
				flag = false;
			if(expected.get(i).getSalary() != actual.get(i).getSalary())
				flag = false;
		}

		assertTrue(flag);
	}


}