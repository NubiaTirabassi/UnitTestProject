package com.empresa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestAssertions {

	@Test
	public void testEqualsIgnoreCase() {

		String str1 = "Hello";
		String str2 = "Hello";

		assertTrue(str1.equalsIgnoreCase(str2));

	}

	@Test
	public void testAssertFalse() {
		int number = 3;
		assertFalse(number > 5);
	}

	@Test
	public void testAssertEquals() {
		int number = 3;
		assertEquals(number, 3);
	}

	@Test
	public void testAssertNull() {
		Object obj = null;
		assertNull(obj);
	}

	@Test
	public void testAssertSame() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertSame(obj1, obj2);

	}

	@Test
	public void testAssertNotSame() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertNotSame(obj1, obj2);

	}

	@Test
	public void testAssertN() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertNotSame(obj1, obj2);

	}

	@Test
	public void testAssertArrayEquals() {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };

		assertArrayEquals(array1, array2);

	}

}
