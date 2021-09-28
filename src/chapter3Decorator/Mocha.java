package chapter3Decorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		Size size = this.getSize();
		double beverageCost = beverage.cost();
		double myCost;
		if(size == Size.TALL) {
			myCost = 0.10;
		} else if(size == Size.GRANDE) {
			myCost = 0.15;
		} else {
			myCost = 0.20;
		}
		return beverageCost + myCost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

}
