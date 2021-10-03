package chapter4FactoryMethodAndAbstractFactory.concretePizzaStores;

import chapter4FactoryMethodAndAbstractFactory.Pizza;
import chapter4FactoryMethodAndAbstractFactory.PizzaStore;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.NewYorkCheesePizza;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.NewYorkClamPizza;
import chapter4FactoryMethodAndAbstractFactory.concretePizzas.NewYorkPepperoniPizza;

public class NewYorkPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new NewYorkCheesePizza();
		} else if(type.equals("pepperoni")) {
			return new NewYorkPepperoniPizza();
		} else if(type.equals("clam")) {
			return new NewYorkClamPizza();
		}
		
		return null;
	}

}
