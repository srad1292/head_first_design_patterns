package chapter3Decorator;

public class Espresso extends Beverage {
	
	public Espresso(Size size) {
		this.size = size;
		this.description = "Espresso";
	}
	
	public String getDescription() {
		return this.getSizeString() + " " + this.description;
	}
	
	@Override
	public double cost() {
		if(this.size == Size.TALL) {
			return 1.10;
		} else if(this.size == Size.GRANDE) {
			return 1.45;
		} else {
			return 1.80;
		}
	}

}
