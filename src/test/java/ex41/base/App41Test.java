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
	}

	@Test
	void getOutputFile() throws IOException {

		File test = App41.getOutputFile(App41.getProjectDirectory());

		if(!test.exists()) { fail(); }
	}

}