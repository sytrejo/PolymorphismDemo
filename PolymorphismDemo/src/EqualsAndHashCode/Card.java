package EqualsAndHashCode;

public class Card {
	
	//You could try doing this with an enum
	
	//Hearts, Clubs, Hearts, Spades,
	private int suit;
	
	//Ace - King
	private int rank;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		
	}

	
	public int getSuit() {
		return suit;
	}


	public int getRank() {
		return rank;
	}


	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else {
			if(this.getClass() == o.getClass()) {
			
				//this is called downcasting
				//Downcast
				Card otherCard = (Card) o;
				
				//Compare their properties
				if(this.suit == otherCard.suit && this.rank == otherCard.rank) {
					return true;
				}
			}
				return false;
		}
	}
	
	//This is a bad implementation to override the hashCode
	//make a better implementation
//	@Override
//	public int hashCode() {
//		return 0;
//	}

	//better
@Override
public int hashCode() {
	return this.rank;
}

	
	

}
