package com.example.kazi.weather_androidtest.services;

import com.example.kazi.weather_androidtest.injection.components.APIComponent;
import com.example.kazi.weather_androidtest.model.WeatherResponse;

import io.reactivex.Observable;

/**
 * Created by kazi on 14/08/2017.
 */

public interface IWeatherInteractor {
    public void initiateInjectionGraph(APIComponent apiComponent);

    Observable<WeatherResponse> get5DaysWeatherList();
}
