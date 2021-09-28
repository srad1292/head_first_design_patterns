package chapter3Decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		Size size = this.getSize();
		double beverageCost = beverage.cost();
		double myCost;
		if(size == Size.TALL) {
			myCost = 0.15;
		} else if(size == Size.GRANDE) {
			myCost = 0.35;
		} else {
			myCost = 0.45;
		}
		return beverageCost + myCost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

}