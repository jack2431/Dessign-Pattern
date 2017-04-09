package com.ch2.observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	//不再需要追蹤 observers，也不需要管理註冊和移除(由 Observable 代勞)
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		//不再需要建立資料結構以記住所有 observers
	}
	
	//沒有利用 notifyObservers()，表示採用的作法為「拉取(pull)」
	
	public void measurementsChanged() {
		setChanged();//在呼叫 notifyObservers() 之前，要呼叫 setChanged() 記路狀態已經改變的事實
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
