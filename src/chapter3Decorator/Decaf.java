package chapter3Decorator;

public class Decaf extends Beverage {
	
	public Decaf(Size size) {
		this.size = size;
		this.description = "Decaf";
	}
	
	public String getDescription() {
		return this.getSizeString() + " " + this.description;
	}
	
	@Override
	public double cost() {
		if(this.size == Size.TALL) {
			return 0.95;
		} else if(this.size == Size.GRANDE) {
			return 1.05;
		} else {
			return 1.20;
		}
	}

}
