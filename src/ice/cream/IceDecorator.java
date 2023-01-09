package ice.cream;


public abstract class IceDecorator extends Cream{
	protected Cream cream;
	
	public IceDecorator(Cream cream) {
		super(0);
		this.cream = cream;
	}
}
