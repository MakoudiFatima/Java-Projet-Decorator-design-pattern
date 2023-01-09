package ice.cream;



public class IceSauce extends IceDecorator{
	
	private String creamSauce;
	private double sauceCost=0;
	
	public IceSauce(String creamSauce, Cream cream) {
		super(cream);
		this.creamSauce = creamSauce;
	}
	
	@Override
	public void setCost() {
		if(creamSauce.equals("Caramel Sauce")) 
			sauceCost = 2;
		else if(creamSauce.equals("Chocolat Sauce"))
			sauceCost = 2;
		else if(creamSauce.equals("Strawberry Sauce"))
			sauceCost = 2;
	}
	
	public double getCost() {
		setCost();
		return sauceCost+cream.getCost();
	}
}
