package com.java.sugyant;

public class Chicken extends BirdFactory{

	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		}

	  public boolean sing() {

		System.out.println("Cluck, cluck");
		return true;
	}

}
