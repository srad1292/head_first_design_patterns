package chapter3Decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast(Size size) {
		this.size = size;
		this.description = "Dark Roast";
	}
	
	public String getDescription() {
		return this.getSizeString() + " " + this.description;
	}
	
	@Override
	public double cost() {
		if(this.size == Size.TALL) {
			return 1.90;
		} else if(this.size == Size.GRANDE) {
			return 2.20;
		} else {
			return 2.46;
		}
	}

}
