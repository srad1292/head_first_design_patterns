package chapter2Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	WeatherData subject;
	WeatherData weatherData;
	
	
	public CurrentConditionsDisplay(WeatherData subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Observable observable) {
		if(observable instanceof WeatherData) {
			this.weatherData = (WeatherData) observable;
			this.display();
		}

	}
	
	public void display() {
		System.out.println("Current conditions: " + this.weatherData.getTemperature() + " degrees F and " + this.weatherData.getHumidity() + "% humidity");
	}
	

}
