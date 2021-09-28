package chapter3Decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		Size size = this.getSize();
		double beverageCost = beverage.cost();
		double myCost;
		if(size == Size.TALL) {
			myCost = 0.20;
		} else if(size == Size.GRANDE) {
			myCost = 0.25;
		} else {
			myCost = 0.30;
		}
		return beverageCost + myCost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

}