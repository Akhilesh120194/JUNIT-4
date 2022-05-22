package com.akhilexpress.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringUtilTest {

	MyStringUtil ms;

	@Before
	public void setUp() {
		System.out.println("Inside Setup Method");
		ms = new MyStringUtil();
	}

	@Test
	public void reverseString_test() {
		System.out.println("Inside reverseString_test method");
		String reverseString = ms.reverseString("ABC");

		assertEquals(reverseString, "CBA");
		assertNotNull(reverseString);

	}

	@Test
	public void isStringPallindrome_test() {

		System.out.println("Inside isStringPallindrome_test method");
		String pallindrome = ms.reverseString("level");

		assertEquals(pallindrome, "level");
		assertNotNull(pallindrome);

	}

	@Test(expected = IllegalArgumentException.class)
	public void reverseStringWithNullAsParamValue_test() {
		System.out.println("Inside reverseStringWithNullAsParamValue_test method");
		String reverseString = ms.reverseString(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void reverseStringWithEmptyStringAsParamValue_test() {
		System.out.println("Inside reverseStringWithEmptyStringAsParamValue_test method");
		String reverseString = ms.reverseString("");

	}

	@After
	public void cleanUp() {
		System.out.println("Inside clean up method");
	}

}
