package com.eastzq.designpatterns.creational.factory.method;

public class ConsoleLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new ConsoleLogger();
	}
}
