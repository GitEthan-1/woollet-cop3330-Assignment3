/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex44.base;

public class Product {
	private String Name = null;
	private double PRICE = 0 ;
	private int QUANTITY = 0;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPRICE() {
		return PRICE;
	}

	public void setPRICE(double PRICE) {
		this.PRICE = PRICE;
	}

	public int getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(int QUANTITY) {
		this.QUANTITY = QUANTITY;
	}

	@Override
	public String toString() {
		return "Product{" +
				"Name='" + Name + '\'' +
				", PRICE=" + PRICE +
				", QUANTITY=" + QUANTITY +
				'}';
	}

	public Product(String name, double PRICE, int QUANTITY) {
		Name = name;
		this.PRICE = PRICE;
		this.QUANTITY = QUANTITY;
	}
}
