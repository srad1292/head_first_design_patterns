package chapter4FactoryMethodAndAbstractFactory;

import chapter4FactoryMethodAndAbstractFactory.concretePizzaStores.ChicagoPizzaStore;
import chapter4FactoryMethodAndAbstractFactory.concretePizzaStores.NewYorkPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NewYorkPizzaStore();
		nyStore.orderPizza("cheese");
		System.out.println();
		nyStore.orderPizza("pepperoni");
		System.out.println();
		nyStore.orderPizza("clam");
		System.out.println();
		
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		chicagoStore.orderPizza("cheese");
		System.out.println();
		chicagoStore.orderPizza("pepperoni");
		System.out.println();
		chicagoStore.orderPizza("clam");
		System.out.println();
	}

}
