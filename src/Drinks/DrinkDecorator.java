package Drinks;


public abstract class DrinkDecorator extends Drink{
	
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		super(0);
		this.drink = drink;
	}
}
