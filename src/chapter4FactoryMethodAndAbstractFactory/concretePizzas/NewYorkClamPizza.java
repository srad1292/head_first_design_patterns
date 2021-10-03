package chapter4FactoryMethodAndAbstractFactory.concretePizzas;

import chapter4FactoryMethodAndAbstractFactory.Pizza;

public class NewYorkClamPizza extends Pizza {
	
	public NewYorkClamPizza() {
		name = "New York Clam Pizza";
		dough = "Thin Crust";
		sauce = "Marinara Sauce";
		toppings.add("Reggiano Cheese");
		toppings.add("Fresh Clams");
	}
}
