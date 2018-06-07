package com.eastzq.designpatterns.creational.factory.method;

public class FileLogger implements Logger {

	@Override
	public void debug(String s) {
		System.out.println("fileLogger debug");
	}

}
