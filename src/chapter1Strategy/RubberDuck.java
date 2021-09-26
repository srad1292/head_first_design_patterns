package chapter1Strategy;

import chapter1Strategy.fly.FlyNoWay;
import chapter1Strategy.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("I look like a rubber duck!");

	}

}
