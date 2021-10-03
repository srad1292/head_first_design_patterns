package chapter4FactoryMethodAndAbstractFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the interface for the abstract product.
 * All of the concrete products will implement this
 * abstraction so that concrete creators can create
 * concrete products that will all have the same interface
 * allowing them to be used interchangeably.  
 * 
 * Also, the concrete products and the concrete creators
 * all will now depend on this abstraction, rather than
 * the creators depending on other low level concrete products.
 * 
 * Depending on this high level abstraction rather than
 * low level classes is known as the "Dependency Inversion Principle"
 *
 */
public abstract class Pizza {
	
	public String name;
	public String dough;
	public String sauce;
	public List<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name + "...");
		System.out.println("Using " + dough);
		System.out.println("Adding " + sauce);
		toppings.forEach(topping -> System.out.println("Adding " + topping));
	}

	public void bake() {
		System.out.println("Baking at 550 degrees for 8 minutes");
	}

	public void box() {
		System.out.println("Place in official pizza store box");

	}
	
	public void slice() {
		System.out.println("Slicing into triangles");
	}


}
