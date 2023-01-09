package Drinks;


import java.util.ArrayList;

public class DrinkToppings extends DrinkDecorator{
	
	private ArrayList<String> drinkToppings; 
	private double toppingsCost=0;
	
	public DrinkToppings(ArrayList<String> drinkToppings, Drink drink) {
		super(drink);
		this.drinkToppings = drinkToppings;
	}
	
	@Override
	public void setCost() {
		int size  = drinkToppings.size();
		toppingsCost =  3 * size; 
		//Each topping cost 3, so depending upon the toppings cost is calculated
	}
	
	public double getCost() {
		setCost();
		return toppingsCost+drink.getCost();
	}
	
	
}

