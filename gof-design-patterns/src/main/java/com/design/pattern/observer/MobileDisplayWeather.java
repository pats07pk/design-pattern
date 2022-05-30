package com.design.pattern.observer;

public class MobileDisplayWeather implements WeatherObserver {


    @Override
    public void update(WeatherDataVo vo) {
        System.out.println("Mobile Display showing new weather data ==> "+ vo);
    }
}
