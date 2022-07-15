package EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

public class Demo {
	

	public static void main (String[] args) {
		
		Card aceOfDiamonds = new Card(0,0);
		Card kingOfSpades = new Card(3,12);
		Card fiveOfClubs = new Card(1,4);
		Card anotherAceOfDiamonds = new Card (0,0);
		
		
		//Compare the cards equality
		//looks at their memory location
		boolean cardsEqual = aceOfDiamonds.equals(kingOfSpades);
		
		//compare two instances that point to the same object location
		boolean cardsEqual2 = aceOfDiamonds.equals(anotherAceOfDiamonds);
		
		//The value of a reference is a memory location
		//this gives false because they don't point to the same object
		System.out.println( aceOfDiamonds == kingOfSpades);
		
		
		System.out.println("The cards are equal: " + cardsEqual);
		
		//this will return false without an override of the equals 
		System.out.println("Are the two ace cards the same? " + cardsEqual2);
		
		
		//When using a hashset you should override the equals and hashcode 
		//
		Set<Card>deck = new HashSet<Card>();
		deck.add(aceOfDiamonds);
		deck.add(kingOfSpades);
		deck.add(fiveOfClubs);
		deck.add(anotherAceOfDiamonds);
		
		int size = deck.size();
		
		System.out.println("The number of cards in the deck is: " + size);
	
	}
}
