package com.eastzq.designpatterns.creational.factory.abstraction;

public class SummerSkinFactory implements SkinFactory {
	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

}
