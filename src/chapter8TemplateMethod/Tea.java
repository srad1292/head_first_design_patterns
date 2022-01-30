package chapter8TemplateMethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping tea in water");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon");
	}

}
