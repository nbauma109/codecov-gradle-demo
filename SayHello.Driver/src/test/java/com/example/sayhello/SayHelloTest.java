package com.example.sayhello;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayHelloTest {

	@Test
	public void testSayHello() throws Exception {
		assertEquals("Hello", SayHelloDriver.sayHello());
	}
}
