package com.java.sugyant;

public class Cat implements AnimalFactory{

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		
	}

	@Override
	public boolean sing() {
		System.out.println("Meow");
		return true;
		
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can Swim");
		return true;
	}

}
