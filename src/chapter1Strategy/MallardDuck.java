package chapter1Strategy;

import chapter1Strategy.fly.FlyWithWings;
import chapter1Strategy.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I look like a mallard!");

	}

}
