package chapter8TemplateMethod;

public abstract class CaffeineBeverage {
	
	/*
	 * This is the template method that gives the pattern it's name
	 * 
	 * The template method defines the steps of an algorithm and lets 
	 * subclasses use their own implementation of anywhere from none to all of the method calls
	 * that exist within the template.
	 * 
	 * The template method is marked as final because we don't want subclasses to redefine
	 * the steps, we just want to let them use their own interpretation of any step
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	// Primitive operations are marked as abstract so that subclasses must define them
	abstract void brew();
	abstract void addCondiments();
	
	// Concrete methods have implementation in the template method class
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	/**
	 *  This has a default implementation, but can be overridden by 
	 *  subclasses to be handled in a different way.  A method in the
	 *  template method that can be overridden but doesn't have to is 
	 *  called a 'hook'.  Hooks can provide a default implementation
	 *  or they can provide no implementation at all. 
	 */
	boolean customerWantsCondiments() {
		return true;
	}
}
