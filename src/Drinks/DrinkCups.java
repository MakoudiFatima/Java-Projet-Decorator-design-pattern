package Drinks;


public class DrinkCups extends DrinkDecorator{
	
	private String drinkCups;
	private double cupCost=0;
	
	public DrinkCups(String drinkCups, Drink drink) {
		super(drink);
		this.drinkCups = drinkCups;
	}
	
	public String getCrust() {
		return drinkCups;
	}
		
	@Override
	public void setCost() {
		if(drinkCups.equals("1 cup")) 
			cupCost = 5;
		else if(drinkCups.equals("2 cups"))
			cupCost = 10;
		else if(drinkCups.equals("3 cups"))
			cupCost = 15;
		else if(drinkCups.equals("4 cups"))
			cupCost = 20;
		else if(drinkCups.equals("5 cups"))
			cupCost = 25;
		else if(drinkCups.equals("6 cups"))
			cupCost = 30;
		else if(drinkCups.equals("7 cups"))
			cupCost = 35;
		else if(drinkCups.equals("8 cups"))
			cupCost = 40;

	}
	
	public double getCost() {
		setCost();
		return cupCost+drink.getCost();
	}
	
}

