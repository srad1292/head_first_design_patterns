package chapter1Strategy.fly;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying with a rocket");
	}

}
