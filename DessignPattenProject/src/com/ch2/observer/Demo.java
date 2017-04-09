package com.ch2.observer;

public class Demo {

	public static void main(String[] args) {
		// 建立一主題
		WeatherData weatherData = new WeatherData();
		
		// 建立一佈告板，同時註冊主題
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		// 模擬氣象數據
		weatherData.setMeasurements(80, 70, 30.4f);
	}

}
