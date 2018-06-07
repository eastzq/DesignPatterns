package com.eastzq.designpatterns.creational.factory.method;

public class FileLoggerFactory implements LoggerFactory{
	@Override
	public Logger createLogger() {
		return new FileLogger();
	}
}
