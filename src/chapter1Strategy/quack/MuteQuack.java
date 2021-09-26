package chapter1Strategy.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
