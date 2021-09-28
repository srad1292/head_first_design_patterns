package chapter3Decorator;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public abstract double cost();
	
	public abstract String getDescription();

	public Size getSize() {
		return beverage.getSize();
	}
}
