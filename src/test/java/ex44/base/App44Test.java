package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class App44Test {

	@Test
	void searchProducts() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Elbow Cream", 120.00, 5));
		products.add(new Product("Viagra", 69.69, 69));
		products.add(new Product("Your mom's special ointment", 999999.99, 0));

		String actual1 = App44.searchProducts(products, "Your mom's special ointment");
		String expected1 = "Name: Your mom's special ointment\nPrice: $999999.99\nQuantity: 0";

		assertEquals(expected1,actual1);

		String expected2 = "";
		String actual2 = App44.searchProducts(products,"reverse viagra");
		assertEquals(expected2, actual2);


	}
}