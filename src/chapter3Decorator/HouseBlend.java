package chapter3Decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend(Size size) {
		this.size = size;
		this.description = "House Blend";
	}
	
	public String getDescription() {
		return this.getSizeString() + " " + this.description;
	}
	
	@Override
	public double cost() {
		if(this.size == Size.TALL) {
			return 0.90;
		} else if(this.size == Size.GRANDE) {
			return 1.10;
		} else {
			return 1.25;
		}
	}

}
