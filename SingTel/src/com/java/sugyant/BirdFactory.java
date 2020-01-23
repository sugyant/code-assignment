package com.java.sugyant;

public class BirdFactory implements AnimalFactory {
	 public boolean fly() {
		System.out.println("I am flying");
		return true;
		}

	  public boolean sing() {

		System.out.println("I am Singing");
		return true;
	}

	@Override
	public boolean walk() {
		
			System.out.println("I am walking");
		return true;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
	}
}
