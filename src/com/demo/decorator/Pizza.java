package com.demo.decorator;

import java.util.ArrayList;

public class Pizza {
	
	String pizzaSize, crust, sauce, cheese;
	ArrayList<String> toppings;
	double cost;
	
	public Pizza(double cost) {
		this.cost = cost;
	}
		public double getCost() {
		return cost;
	}
	public void setCost() {
		
	}
}
