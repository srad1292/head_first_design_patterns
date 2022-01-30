package chapter8TemplateMethod;

public class StarBuzzCafe {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
		Tea tea = new Tea();
		tea.prepareRecipe();

	}

}
