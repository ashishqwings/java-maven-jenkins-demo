package com.hcl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testGreet() {
		assertEquals("Hello, Jenkins", App.greet());
	}
	
}


