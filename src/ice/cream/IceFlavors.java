package ice.cream;


public class IceFlavors extends IceDecorator{
	
	private String creamFlavors;
	private double flavorCost=0;
	
	public IceFlavors(String creamFlavors, Cream cream) {
		super(cream);
		this.creamFlavors = creamFlavors;
	}
	
	@Override
	public void setCost() {
		if(creamFlavors.equals("Vanilla")) 
			flavorCost = 2;
		else if(creamFlavors.equals("Chocolat"))
			flavorCost = 2;
		else if(creamFlavors.equals("Lemon"))
			flavorCost = 2;
		else if(creamFlavors.equals("Strawberry"))
			flavorCost = 2;
	}
	
	public double getCost() {
		setCost();
		return flavorCost+cream.getCost();
	}
}

