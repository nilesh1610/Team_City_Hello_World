package com.nilesh.citest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nilesh.citest.HelloWorld;

public class sayHelloTest {
	//Testng Tests
	@Test
	public void testSayHello(){
		new HelloWorld();
		Assert.assertTrue("Hello abc!".equalsIgnoreCase(HelloWorld.sayHello("abc")), "Test if both the strings are equal");
	}

}
