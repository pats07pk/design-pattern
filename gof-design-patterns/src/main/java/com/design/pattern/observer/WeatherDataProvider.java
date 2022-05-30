package com.design.pattern.observer;

public interface WeatherDataProvider {

    public void subscribe(WeatherObserver observer);
    public void unsubscribe(WeatherObserver observer);
    public void notifyObservers(WeatherDataVo vo);
}
