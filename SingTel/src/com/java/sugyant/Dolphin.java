package com.java.sugyant;

public class Dolphin implements AnimalFactory{

	Fish fish;
	
	void hasFishBehaviour(Fish fish)
	{
		this.fish =fish;
	}
	@Override
	public boolean fly() {
		
		fish.fly();
		return fish.fly();
	}

	@Override
	public boolean sing() {
		fish.sing();
		return false;
	}

	@Override
	public boolean walk() {
		fish.walk();
		return false;
	}
	public boolean swim() {
		fish.swim();
		return true;
	}

}
