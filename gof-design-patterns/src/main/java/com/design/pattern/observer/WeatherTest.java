package com.design.pattern.observer;

public class WeatherTest {

    public static void main(String[] args) {

        WeatherNotifier notifier = new WeatherNotifier();

        WebUIDisplayWeather webDisplay = new WebUIDisplayWeather();
        MobileDisplayWeather mobileDisplay = new MobileDisplayWeather();

        notifier.subscribe(webDisplay);
        notifier.subscribe(mobileDisplay);

        //WeatherDataVo data_1 = new WeatherDataVo(23, 12, 43);

        notifier.setNewMeasurement(23,12,43);

        notifier.unsubscribe(mobileDisplay);

        notifier.setNewMeasurement(20,10,30);

    }
}
