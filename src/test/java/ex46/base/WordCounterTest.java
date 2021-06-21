package ex46.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

	@Test
	void addWords_test1() {
		WordCounter counter = new WordCounter();
		counter.addWords(" a b b c c c");
		assertEquals(counter.allWords.size(), 6);
		assertEquals(counter.wordCount.size() , 3);
	}

	@Test
	void addWords_test2() {
		WordCounter counter = new WordCounter();
		counter.addWords("wa waa waaaaaaaaaaa wa w a w aa w w  a a a a w a a w a  w a  w ww  ww wwww a a a a aaaaaa ");
		assertEquals(counter.allWords.size(), 30);
		assertEquals(counter.wordCount.size() , 9);
	}

	@Test
	void toGraph_test1() {
		WordCounter counter = new WordCounter();
		counter.addWords(" a b b c c c");

		String expected = """
				c:                  ***
				b:                  **
				a:                  *
				""";
		String actual = counter.toGraph();
		assertEquals(expected,actual);
	}

	@Test
	void toGraph_test2() {
		WordCounter counter = new WordCounter();
		counter.addWords("wa waa waaaaaaaaaaa wa w a w aa w w  a a a a w a a w a  w a  w ww  ww wwww a a a a aaaaaa ");

		String expected = """
				a:                  *************
				w:                  ********
				wa:                 **
				ww:                 **
				waa:                *
				waaaaaaaaaaa:       *
				aa:                 *
				wwww:               *
				aaaaaa:             *
				""";
		String actual = counter.toGraph();
		assertEquals(expected,actual);
	}
}