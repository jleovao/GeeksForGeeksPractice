package com.jleovao.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatheratorTest {
	
	private Matherator classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new Matherator();
	}

	@Test
	public void testSubtract() {
		long result = 100 - 15 - (-17) - 53;
		assertEquals(result, classUnderTest.subtract(100, 15, -17, 53));
		
		result = 0;
		assertEquals(result, classUnderTest.subtract(0, 0, 0, 0, 0));
	}

	@Test
	public void testAdd() {
		// Let Java add it up
		long result = 10 + 23 + (-1) + 16;
		// We will compare that to what Matherator gives us.
		assertEquals(result, classUnderTest.add(10, 23, -1, 16));
		
		result = 100 + 102;
		assertEquals(result, classUnderTest.add(100, 102));
		
		result = 0;
		assertEquals(result, classUnderTest.add(0));
	}
	
	@Test
	public void testMultiplier() {
		long result = 10 * 10 * 10;
		assertEquals(result, classUnderTest.multiply(10, 10, 10));
		
		result = 234 * 94 * (-1000) * 0 * 3;
		assertEquals(result, classUnderTest.multiply(234, 94, -1000, 0, 3));
		
		result = 0;
		assertEquals(result, classUnderTest.multiply(0));
		
		result = 50 * -1 * -1;
		assertEquals(result, classUnderTest.multiply(50, -1, -1));
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivider() {
		long result = 8 / 2 / 2;
		assertEquals(result, classUnderTest.divide(8, 2, 2));
		
		result = 50797 / 79;
		assertEquals(result, classUnderTest.divide(50797, 79));
		
		result = 5 / 0;
		assertEquals(result, classUnderTest.divide(5, 0));
	}

}
