package chapter2Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
	
	private List<Observer> observers; 
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	/**
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public WeatherData() {
		super();
		this.observers = new ArrayList<Observer>(); 
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = this.observers.indexOf(observer);
		if(index >= 0) {
			this.observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(observer -> observer.update(this));
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}
	
	

}
