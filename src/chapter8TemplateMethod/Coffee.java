package chapter8TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter.");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding milk and sugar.");
	}
	
	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		return answer.toLowerCase().startsWith("y");
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch(IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}

}
