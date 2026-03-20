package com.hcl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testGreet() {
		assertEquals("Hello, Jenkins", App.greet());
	}
	
	@Test
	public void testGreet2() {
		assertEquals("Hello, Sanjivani", App.greet());
	}
	
	
}


