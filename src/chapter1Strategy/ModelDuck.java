package chapter1Strategy;

import chapter1Strategy.fly.FlyNoWay;
import chapter1Strategy.quack.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I look like a model duck");
	}

}
