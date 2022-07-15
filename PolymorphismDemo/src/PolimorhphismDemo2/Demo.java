package PolimorhphismDemo2;

import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		
//		DiningHall diningHall = new DiningHall();
//		Person person1 = new HealthyEater();
//		Person person2 = new HealthyEater();
//		Person person3 = new HealthyEater();
//		Person person4 = new FreeSpiritedChild();
//		Person person5 = new FreeSpiritedChild();

		//using the createPerson method
		//the new keyword should only be used in the creation of an instance
		//calling a method is not an instance creation
		DiningHall diningHall = new DiningHall();
		Person person1 = createPerson();
		Person person2 = createPerson();
		Person person3 = createPerson();
		Person person4 = createPerson();
		Person person5 = createPerson();
		
		diningHall.add(person1);
		diningHall.add(person2);
		diningHall.add(person3);
		diningHall.add(person4);
		diningHall.add(person5);
		
		//calls the method to serve.
		diningHall.serve();
		
	}
	
	
	//This method decides at run time what kind of eater will enter the diningHall
	private static Person createPerson() {
		Random r = new Random();
		boolean isHealthyEater = r.nextBoolean();
		if(isHealthyEater) {
			return new HealthyEater();
		} else {
			return new FreeSpiritedChild();
		}
	}

}
