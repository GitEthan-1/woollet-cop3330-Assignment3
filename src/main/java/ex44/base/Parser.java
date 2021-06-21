/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex44.base;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;

public class Parser {
	private static final JSONParser parse = new JSONParser();

	private static BufferedReader getInFile() throws IOException {
		return new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\input\\exercise44_input.json"));
	}

	public static ArrayList<Product> loadProducts() throws IOException, ParseException {
		return readJson(getInFile());
	}

	private static ArrayList<Product> readJson(BufferedReader in) throws IOException, ParseException {

		JSONObject json = (JSONObject) parse.parse(getInFile());
		JSONArray jsonArray = (JSONArray) json.get("products");

		ArrayList<Product> catalog = new ArrayList<>();

		for(Object item : jsonArray) {
			JSONObject jsonObj = (JSONObject) item;

			String name = (String) jsonObj.get("name");
			double price = Double.parseDouble(jsonObj.get("price").toString());
			int quantity = Integer.parseInt(jsonObj.get("quantity").toString());

			catalog.add(new Product(name,price,quantity));

		}
		return catalog;
	}
}
