/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex43.base;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise 43 - Website Generator
 * Programming languages can create files and folders too.
 *
 * Create a program that generates a website skeleton with the following specifications:
 *
 * Prompt for the name of the site.
 * Prompt for the author of the site.
 * Ask if the user wants a folder for JavaScript files.
 * Ask if the user wants a folder for CSS files.
 * Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 *
 * Example Output
 *
 * Site name: awesomeco
 * Author: Max Power
 * Do you want a folder for JavaScript? y
 * Do you want a folder for CSS? y
 * Created ./website/awesomeco
 * Created ./website/awesomeco/index.html
 * Created ./website/awesomeco/js/
 * Created ./website/awesomeco/css/
 *
 * The user should then find these files and directories created in the working directory of your program.
 */

public class App43 {
	//get user info
		// prompt the user for a site name and author name
		// ask whether the user wants a folder for javascript and/or css
	// create files and folders with user data
		// create ./website folder in root directory
			// create ./website/<website title> directory
				// create ./js and/or ./css dirs in ./website/<website title> folder
				// create index.html file
					// create fileWriter for index.html file
					//format basic index.html file with author name and website title
					// close output stream

	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String title = getString("Site name: ");
		title = title.replace(' ', '-');
		String author = getString("Author: ");
		boolean js = getYesOrNo("Do you want a folder for JavaScript? ");
		boolean css = getYesOrNo("Do you want a folder for CSS? ");

		new WebsiteGenerator(title,author,js,css);

	}

	private static String getString (String message) {
		System.out.print(message);
		return in.nextLine();
	}

	private static boolean getYesOrNo(String message) {
		System.out.print(message);
		if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
			return true;

		return false;
	}


}
