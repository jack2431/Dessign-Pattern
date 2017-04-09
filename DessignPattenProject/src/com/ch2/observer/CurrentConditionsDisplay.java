package com.ch2.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author RABBITLIKE
 * 目前狀況佈告板
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable; 
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		//建構子需要 Observable 當參數，並將 CurrentConditionsDisplay 登記成為 observer
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("temperature:" + temperature + ", humidity:" + humidity);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
