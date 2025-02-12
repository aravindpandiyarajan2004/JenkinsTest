package com.aravind.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}
	
	@AfterEach
	public void tearDown() {
		calculator = null;
		System.out.println("Test finished");
	}

	@Test
	void testAdd() {
		assertEquals(12,calculator.add(5,7)); //we need to call method by using  Calculator object
	}
	
	@Test
	void testSub() {
		assertEquals(2,calculator.sub(5, 3));
	}
	
//	@Disabled("disabled until bug#1 is fixed")
	@Test
	 void testSubNegativeResult() {
		assertEquals(-2,calculator.sub(3, 5));
	}

}
