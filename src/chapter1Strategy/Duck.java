package chapter1Strategy;

import chapter1Strategy.fly.FlyBehavior;
import chapter1Strategy.quack.QuackBehavior;

public abstract class Duck {

	/**
	 * By adding reference properties where subclasses of Duck can set the fly behavior and quack behavior
	 * we are saying that ducks are composed of these behaviors and also letting subclasses
	 * specify behaviors that may change many times between ducks but may also be shared by many ducks.
	 * This lets us reuse code while also avoiding the need to change code in every subclass that may 
	 * use a certain behavior if that behavior changes
	 */
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	
	
}
