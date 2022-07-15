package PolimorhphismDemo2;

import java.util.ArrayList;
import java.util.List;

public class DiningHall {
	
	private List<Person> customers = new ArrayList<Person>();
	
	public void add(Person person) {
		this.customers.add(person);
	}
	
	public void serve() {
		for (Person customer : customers) {
			customer.eat();
		}
	}

}
