package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherNotifier implements WeatherDataProvider {
    private List<WeatherObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(WeatherObserver observer) {
        System.out.println("==> Adding a new subscriber");
        observers.add(observer);
    }

    @Override
    public void unsubscribe(WeatherObserver observer) {
        System.out.println("==> Removing the subscriber from the list");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(WeatherDataVo vo) {
        System.out.println("==> Notifying all subscribers");
        observers.forEach( obs -> {
            obs.update(vo);
        });
    }


    public void setNewMeasurement(float temperature, float humidity, float pressure) {
        System.out.println("==> Setting new measurements");
        WeatherDataVo weatherDataVo = new WeatherDataVo(temperature, humidity, pressure);
        System.out.println("==> New weather data : " + weatherDataVo);
        notifyObservers(weatherDataVo);
    }

}
