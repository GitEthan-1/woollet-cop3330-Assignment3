/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
	private static final File rootDirectory = new File(System.getProperty ("user.dir"));

	public String WEBSITE_NAME = "example-website";
	public String AUTHOR_NAME = "John Doe";
	public boolean JS = true;
	public boolean CSS = true;
	private FileWriter index;

	public WebsiteGenerator( String title, String author , boolean js, boolean css) throws IOException {
		WEBSITE_NAME = title;
		AUTHOR_NAME = author;
		JS = js;
		CSS = css;

		if(createWebsiteDirectory())
			System.out.println("Created ./website/"+WEBSITE_NAME);
		if(createIndex())
			System.out.println("Created ./website/"+WEBSITE_NAME+"/index.html");

		if(JS)
			if(createJSDirectory())
				System.out.println("Created ./website/"+WEBSITE_NAME+"/js/");

		if(CSS)
			if(createCSSDirectory())
				System.out.println("Created ./website/"+WEBSITE_NAME+"/css/");
	}

	public WebsiteGenerator() {

	}

	private boolean createWebsiteDirectory() {
		new File(rootDirectory + "\\website").mkdir();
		return createWebsiteNameDirectory();
	}

	private boolean createWebsiteNameDirectory() {
		new File(rootDirectory + "\\website\\" + WEBSITE_NAME).mkdir();
		return new File(rootDirectory + "\\website\\" + WEBSITE_NAME).isDirectory();
	}

	private boolean createJSDirectory() {
		new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\js").mkdir();
		return new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\js").isDirectory();
	}

	private boolean createCSSDirectory() {
		new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\css").mkdir();
		return new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\css").isDirectory();

	}

	private boolean createIndex() throws IOException {

		File newIndex = new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\index.html");
		if(!newIndex.createNewFile())
			System.out.println("error");

		getIndexWriter();

		index.write(generateIndexContent(WEBSITE_NAME,AUTHOR_NAME));
		index.close();

		return new File(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\index.html").exists();
	}

	private void getIndexWriter() throws IOException {
		index = new FileWriter(rootDirectory + "\\website\\" + WEBSITE_NAME + "\\index.html");
	}

	public String generateIndexContent( String title, String author ) {

		String output = "<!DOCTYPE html>\n\n<html>\n\t<head>\n" +
						"\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" author =\""+author+"\">\n" +
						"\t\t<title>" + title + "</title>\n" +
						"\t</head>\n\t<body>\n" +
						"\t\t<p>\n\t\t\t<----Replace with something useful---->\n\t\t</p>\n" +
						"\t</body>\n</html>";

		return output;

	}
}
