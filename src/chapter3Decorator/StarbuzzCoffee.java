package chapter3Decorator;

public class StarbuzzCoffee {

	/**
	 * Decorator:
	 * Attach additional responsibilities to an object dynamically.
	 * Decorators provide a flexible alternative to subclassing for extending functionality.
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso(Size.GRANDE);
		
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription());
		double cost = beverage.cost();
		System.out.println("Cost: $" + cost);
		
		Beverage beverage2 = new DarkRoast(Size.VENTI);
		
		beverage2 = new Milk(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription());
		double cost2 = beverage2.cost();
		System.out.println("Cost: $" + cost2);


	}

}
