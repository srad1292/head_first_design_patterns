package chapter4FactoryMethodAndAbstractFactory.concretePizzaStores;

import chapter4FactoryMethodAndAbstractFactory.Pizza;
import chapter4FactoryMethodAndAbstractFactory.PizzaStore;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.ChicagoCheesePizza;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.ChicagoClamPizza;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.ChicagoPepperoniPizza;


public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoCheesePizza();
		} else if(type.equals("pepperoni")) {
			return new ChicagoPepperoniPizza();
		} else if(type.equals("clam")) {
			return new ChicagoClamPizza();
		}
		return null;
	}

}
