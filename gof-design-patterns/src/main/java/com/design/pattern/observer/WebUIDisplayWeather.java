package com.design.pattern.observer;

public class WebUIDisplayWeather implements WeatherObserver {

    @Override
    public void update(WeatherDataVo vo) {
        System.out.println("Web UI Display showing new Weather data ==> "+ vo);
    }

}
