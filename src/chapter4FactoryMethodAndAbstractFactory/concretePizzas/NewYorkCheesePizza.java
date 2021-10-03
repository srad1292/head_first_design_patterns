package chapter4FactoryMethodAndAbstractFactory.concretePizzas;

import chapter4FactoryMethodAndAbstractFactory.Pizza;

public class NewYorkCheesePizza extends Pizza {

	public NewYorkCheesePizza() {
		name = "New York Cheese Pizza";
		dough = "Thin Crust";
		sauce = "Marinara Sauce";
		toppings.add("Reggiano Cheese");
	}

}
