package chapter4FactoryMethodAndAbstractFactory.concretePizzas;

import chapter4FactoryMethodAndAbstractFactory.Pizza;

public class NewYorkPepperoniPizza extends Pizza {

	public NewYorkPepperoniPizza() {
		name = "New York Pepperoni Pizza";
		dough = "Thin Crust";
		sauce = "Marinara Sauce";
		toppings.add("Reggiano Cheese");
		toppings.add("Sliced Pepperoni");
	}

}
