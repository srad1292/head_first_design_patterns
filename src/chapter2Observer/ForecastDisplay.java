package chapter2Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	WeatherData subject;
	WeatherData weatherData;
	
	public ForecastDisplay(WeatherData subject) {
		this.subject = subject;
		subject.addObserver(this);
	}


	public void update(Observable observable) {
		if (observable instanceof WeatherData) {
			this.weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = this.weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}