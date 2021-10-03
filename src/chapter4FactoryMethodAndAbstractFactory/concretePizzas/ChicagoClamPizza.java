package chapter4FactoryMethodAndAbstractFactory.concretePizzas;

import chapter4FactoryMethodAndAbstractFactory.Pizza;

public class ChicagoClamPizza extends Pizza {
	
	public ChicagoClamPizza() {
		name = "Chicago Clam Pizza";
		dough = "Deep Dish Crust";
		sauce = "Plum Tomato Sauce";
		toppings.add("Frozen Clams");
		toppings.add("Buffalo Mozzarella Cheese");
	}
	
	@Override
	public void bake() {
		System.out.println("Bake at 350 for 25-30 Minutes");
	}

}
