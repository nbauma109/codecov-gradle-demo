package com.example.sayhello;

import com.example.sayhello.core.SayHelloCore;

public class SayHelloDriver {

	public static void main(String[] args) {
		System.out.println(sayHello());
	}

	public static String sayHello() {
		return SayHelloCore.sayHello();
	}

}
