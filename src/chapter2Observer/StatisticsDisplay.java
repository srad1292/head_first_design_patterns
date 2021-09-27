package chapter2Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	WeatherData subject;
	WeatherData weatherData;

	public StatisticsDisplay(WeatherData subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	public void update(Observable observable) {
		if (observable instanceof WeatherData) {
			this.weatherData = (WeatherData)observable;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

}
