package com.eastzq.designpatterns.creational.factory.method;

public class ConsoleLogger implements Logger{

	@Override
	public void debug(String s) {
		System.out.println("consoleLogger debug");
	}
	
}
