package chapter2Observer;

public class WeatherStation {

	/**
	 * Observer Pattern: 
	 * Defines a one-to-many dependency between objects so that when one object changes state, 
	 * all of its dependents are notified and updated automatically.
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		
		weatherData.setMeasurements(92.0f, 65.0f, 30.0f);
		System.out.println();
		weatherData.setMeasurements(87.4f, 65.4f, 28.0f);
		System.out.println();
		weatherData.setMeasurements(84.0f, 64.2f, 31.0f);
		System.out.println();
		weatherData.setMeasurements(80.2f, 70.0f, 26.7f);
		

	}

}
