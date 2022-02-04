package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testPriceVar() {
		//create an instance of the object to test
		//set the value of the price to 1.25
		Product prod = new Product("Dr. Pepper", 1.25);
		//state my expected return value
		double expected = 1.25;
		//get the actual value in the object
		double actual = prod.getProdPrice();
		//compare using assert
		assertEquals(expected, actual, 0);
	}
	@Test
	public void testPriceVarForLessThanZero() {
	//create an instance of the object to test
	//set the value of the price to -1.99
		Product prod = new Product("Dr. Pepper", -1.99);
		//state my expected return value
		double expected = 0.25;
		//get the actual value in the object
		double actual = prod.getProdPrice();
		//compare using assert
		assertEquals(expected, actual, 0);
	}
}
