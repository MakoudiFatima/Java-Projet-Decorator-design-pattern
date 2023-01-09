package ice.cream;



public class IceSize extends IceDecorator{

	private String creamSize;
	private double sizeCost;
	
	public IceSize(String creamSize, Cream cream) {
		super(cream);
		this.creamSize = creamSize;
	}
	@Override
	public void setCost() {
		if(creamSize.equals("Small cup 8oz\""))
			sizeCost = 1;
		else if(creamSize.equals("Pint 16oz\""))
			sizeCost = 2;
		else if(creamSize.equals("Liter 32oz\""))
			sizeCost = 3;
		else if(creamSize.equals("Bucket 4L 64oz\""))
			sizeCost = 4;
	}

	public double getCost() {
		setCost();
		return sizeCost+cream.getCost();
	}
	

}
