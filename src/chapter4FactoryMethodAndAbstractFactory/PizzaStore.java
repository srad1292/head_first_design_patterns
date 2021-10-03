package chapter4FactoryMethodAndAbstractFactory;

/**
 * This is an abstract creator.  It will contain the methods that are used
 * to manipulate products, but will pass off the creation of objects to the
 * "factory method" that all of the concrete creators will need to implement
 *
 */
public abstract class PizzaStore {
	
	public void orderPizza(String type) {
		
		// create pizza
		Pizza pizza = createPizza(type);
		
		// prepare pizza
		pizza.prepare();
		
		// bake pizza
		pizza.bake();
		
		// box pizza
		pizza.box();
		
		// slice pizza
		pizza.slice();
	}
	
	/**
	 * createPizza is abstract and must be implemented by all concrete factories.
	 * This method is the "Factory Method" that the pattern refers to.  
	 * The implementation of this method in each concrete factory will use the passed in
	 * type to determine what pizza to create and return to any client that requests a pizza.
	 * This encapsulates the creation of objects and allows the client to depend on the Pizza 
	 * abstraction rather than the individual concrete pizza classes.s
	 */
	public abstract Pizza createPizza(String type);

}
