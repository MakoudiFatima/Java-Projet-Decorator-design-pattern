package Drinks;


public class DrinkType extends DrinkDecorator{
	
	private String drinkTypes;
	private double typeCost=0;
	
	public DrinkType(String drinkTypes, Drink drink) {
		super(drink);
		this.drinkTypes = drinkTypes;
	}
	
	@Override
	public void setCost() {
		if(drinkTypes.equals("Arabica")) 
			typeCost = 4;
		else if(drinkTypes.equals("Robusta"))
			typeCost = 4;
		else if(drinkTypes.equals("Espresso"))
			typeCost = 5;
		else if(drinkTypes.equals("Latte"))
			typeCost = 4;
		else if(drinkTypes.equals("Cappuccino"))
			typeCost = 5;
		else if(drinkTypes.equals("Americano"))
			typeCost = 6;
		else if(drinkTypes.equals("Irish Coffee"))
			typeCost = 7;
		else if(drinkTypes.equals("Iced Coffee"))
			typeCost = 8;
	}
	
	public double getCost() {
		setCost();
		return typeCost+drink.getCost();
	}
}


