package com.example.sayhello.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SayHelloCoreTest {

	@Test
	public void testSayHello() throws Exception {
		// do nothing - we already have a test in SayHello.Driver
		// we want to avoid a redundant test like this:
		// assertEquals("Hello", SayHelloCore.sayHello());
	}
}
