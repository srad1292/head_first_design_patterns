package chapter4FactoryMethodAndAbstractFactory.concretePizzas;

import chapter4FactoryMethodAndAbstractFactory.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
	
	public ChicagoPepperoniPizza() {
		name = "Chicago Pepperoni Pizza";
		dough = "Deep Dish Crust";
		sauce = "Plum Tomato Sauce";
		toppings.add("Cubed Pepperoni");
		toppings.add("Buffalo Mozzarella Cheese");
	}
	
	@Override
	public void bake() {
		System.out.println("Bake at 350 for 25-30 Minutes");
	}

}
