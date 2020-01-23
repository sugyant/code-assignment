package com.java.sugyant;



public class Test {

	public static void main(String[] args) { 
		AnimalFactory myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		AnimalFactory myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		AnimalFactory myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		
		SpecialRooster myRoosterDel =  new SpecialRooster();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();

		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
	}

}
