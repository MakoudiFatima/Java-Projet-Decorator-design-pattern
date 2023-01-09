package Drinks;

import java.util.ArrayList;

public class Drink {
	
	String type,cup;
	ArrayList<String> toppings;
	double cost;
	
	public Drink(double cost) {
		this.cost = cost;
	}
		public double getCost() {
		return cost;
	}
	public void setCost() {
		
	}
}
