package ice.cream;


import java.util.ArrayList;

	public class IceTopping extends IceDecorator{
		
		private ArrayList<String> creamToppings; 
		private double toppingsCost=0;
		
		public IceTopping(ArrayList<String> creamToppings, Cream cream) {
			super(cream);
			this.creamToppings = creamToppings;
		}
		
		@Override
		public void setCost() {
			int size  = creamToppings.size();
			toppingsCost =  2* size; 
			//Each topping cost 2, so depending upon the toppings cost is calculated
		}
		
		public double getCost() {
			setCost();
			return toppingsCost+cream.getCost();
		}
		
		
	}

