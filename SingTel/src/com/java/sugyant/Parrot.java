package com.java.sugyant;

public class Parrot extends BirdFactory{
 
   AnimalFactory animal=null;
   void livingWith(AnimalFactory animal)
   {
	 this.animal =animal;
	  
   }
   public boolean fly() {
		System.out.println("I am flying");
		return true;
		}

	  public boolean sing() {
if(null==animal)
{
	 this.livingWith(new Duck());
}
		animal.sing();
		return true;
	}

	@Override
	public boolean walk() {
		
			System.out.println("I am walking");
		
		return true;
	}
}
