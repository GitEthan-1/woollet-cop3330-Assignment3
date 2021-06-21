package ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

	@Test
	void replace_test1() {
		String input = """
				unicorns dont exist
				if unicorns did exist, they would most definitely be far too powerful for non unicorns to defeat
				unicorns would also be kinda dumb, soooo""";

		String expected = """
				unicorns dont cry
				if unicorns did cry, they would most definitely be far too powerful for non unicorns to defeat
				unicorns would also be kinda dumb, soooo""";

		String actual = WordReplacer.replace(input, "exist", "cry");

		assertEquals(expected, actual);
	}

	@Test
	void replace_test2() {
		String input = """
				unicorns dont exist
				if unicorns did exist, they would most definitely be far too powerful for non unicorns to defeat
				unicorns would also be kinda dumb, soooo""";

		String expected = """
				women dont exist
				if women did exist, they would most definitely be far too powerful for non women to defeat
				women would also be kinda dumb, soooo""";

		String actual = WordReplacer.replace(input, "unicorns", "women");

		assertEquals(expected, actual);
	}
}