package com.nilesh.citest;

public class HelloWorld {
	
	public static String sayHello(String pers_name){
		
		return "Hello " + pers_name + "!";
	}

	
	public static void main(String args[]){
		
		System.out.println(sayHello("Nilesh"));
	}
}
