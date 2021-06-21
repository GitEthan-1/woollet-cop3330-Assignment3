package ex43.base;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

	@Test
	void generateIndexContent_test1() throws IOException {
		String title = "juanthebeastCo";
		String author = "the juan and only";
		String expected = "<!DOCTYPE html>\n\n<html>\n\t<head>\n" +
				"\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" author =\""+author+"\">\n" +
				"\t\t<title>" + title + "</title>\n" +
				"\t</head>\n\t<body>\n" +
				"\t\t<p>\n\t\t\t<----Replace with something useful---->\n\t\t</p>\n" +
				"\t</body>\n</html>";

		String actual = (new WebsiteGenerator()).generateIndexContent(title, author);

		assertTrue(expected.contentEquals(actual));
	}

	@Test
	void generateIndexContent_test2() throws IOException {
		String title = "";
		String author = "";
		String expected = "<!DOCTYPE html>\n\n<html>\n\t<head>\n" +
				"\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" author =\""+author+"\">\n" +
				"\t\t<title>" + title + "</title>\n" +
				"\t</head>\n\t<body>\n" +
				"\t\t<p>\n\t\t\t<----Replace with something useful---->\n\t\t</p>\n" +
				"\t</body>\n</html>";

		String actual = (new WebsiteGenerator()).generateIndexContent(title, author);

		assertTrue(expected.contentEquals(actual));
	}
}