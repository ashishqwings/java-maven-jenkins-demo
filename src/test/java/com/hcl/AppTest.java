package com.hcl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testGreet() {
		assertEquals("Hello, Jenkins", App.greet());
	}
	
	@Test
	public void testGreet2() {
		assertNotEquals("Hello, Sanjivani", App.greet());
	}
	
	@Test
	public void dummyTest() {
		assertEquals(4, 2 + 2);
	}
	
	
}


