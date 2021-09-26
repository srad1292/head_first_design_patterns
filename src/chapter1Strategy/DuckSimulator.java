package chapter1Strategy;

import chapter1Strategy.fly.FlyWithRocket;

public class DuckSimulator {

	/**
	 * Chapter 1 covers the strategy pattern which is:
	 * 	Defines a family of algorithms, encapsulates them, and makes them interchangeable
	 *  Strategy pattern lets the algorithm vary independently from the client that uses it
	 * 
	 *
	 */
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		System.out.println();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		System.out.println();
		
		ModelDuck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithRocket());
		modelDuck.performFly();
		System.out.println();
	}

}
